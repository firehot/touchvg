//! \file mgshapes.h
//! \brief 定义图形列表接口 MgShapes
// Copyright (c) 2004-2012, Zhang Yungui
// License: LGPL, https://github.com/rhcad/touchvg

#ifndef __GEOMETRY_MGSHAPES_H_
#define __GEOMETRY_MGSHAPES_H_

#include <mgshape.h>

class MgLockRW;

//! 图形列表接口
/*! \ingroup GEOM_SHAPE
    \interface MgShapes
*/
struct MgShapes : public MgObject
{
    static UInt32 Type() { return 1; }

    virtual UInt32 getShapeCount() const = 0;
    virtual MgShape* getFirstShape(void*& it) const = 0;
    virtual MgShape* getNextShape(void*& it) const = 0;
    virtual MgShape* findShape(UInt32 nID) const = 0;
    virtual Box2d getExtent() const = 0;

    virtual MgShape* hitTest(const Box2d& limits, Point2d& nearpt, Int32& segment) const = 0;
    virtual int draw(GiGraphics& gs, const GiContext *ctx = NULL) const = 0;
    virtual UInt32 getChangeCount() = 0;
    virtual void afterChanged() = 0;
    virtual bool save(MgStorage* s) const = 0;
    virtual bool load(MgStorage* s) = 0;

    //! 删除所有图形
    virtual void clear() = 0;
    
    //! 复制出新图形并添加到图形列表中
    virtual MgShape* addShape(const MgShape& src) = 0;
    
    //! 移除一个图形，由调用者删除图形对象
    virtual MgShape* removeShape(UInt32 nID) = 0;

    //! 返回新图形的图形属性
    virtual GiContext* context() = 0;
    
    //! 模型变换矩阵
    virtual Matrix2d& modelTransform() = 0;
    
    //! 得到视图显示比例
    virtual float getViewScale() const = 0;
    
    //! 得到视图中心的世界坐标
    virtual Point2d getViewCenterW() const = 0;
    
    //! 设置视图放缩比例和位置
    virtual void setZoomState(float scale, const Point2d& centerW) = 0;
    
    //! 得到锁定数据对象以便读写锁定
    virtual MgLockRW* getLockData() = 0;
};

//! 读写锁定数据类
/*! \ingroup GEOM_SHAPE
 */
class MgLockRW
{
public:
    MgLockRW();
    bool lock(bool forWrite, int timeout = 200);
    long unlock(bool forWrite);
    
    bool firstLocked();
    bool lockedForRead();
    bool lockedForWrite();
    
private:
    volatile long _counts[3];
};

//! 图形列表锁定辅助类
/*! \ingroup GEOM_SHAPE
 */
class MgShapesLock
{
    int         m_mode;
public:
    MgShapes*   shapes;
    MgShapesLock(MgShapes* sp, bool forWrite = true, int timeout = 200);
    ~MgShapesLock();
    
    bool locked();
    static bool lockedForRead(MgShapes* sp);
    static bool lockedForWrite(MgShapes* sp);
    
    typedef void (*ShapesLocked)(MgShapes* sp, void* obj, bool locked);
    static void registerObserver(ShapesLocked func, void* obj);
    static void unregisterObserver(ShapesLocked func, void* obj);
};

#endif // __GEOMETRY_MGSHAPES_H_
