//! \file GiGraphIos.h
//! \brief Define the graphics class for iOS: GiGraphIos
// Copyright (c) 2004-2012, Zhang Yungui
// License: LGPL, https://github.com/rhcad/touchdraw

#ifndef __GEOMETRY_GRAPHIOS_H_
#define __GEOMETRY_GRAPHIOS_H_

#include <Graph2d/gigraph.h>
#include <CoreGraphics/CGContext.h>

class GiGraphIosImpl;

GiColor giFromCGColor(CGColorRef color);

//! The graphics class for iOS.
/*! getGraphType() of this class returns 10.
    \ingroup GRAPH_IOS
    \see giFromCGColor
*/
class GiGraphIos : public GiGraphics
{
public:
    GiGraphIos(GiTransform* xform);
    virtual ~GiGraphIos();

public:
    bool beginPaint(CGContextRef context, bool buffered = true, bool fast = false);
    void endPaint(bool draw = true);
    static void setScreenDpi(int dpi);

    virtual void clearWnd();
    virtual bool drawCachedBitmap(int x = 0, int y = 0, bool secondBmp = false);
    virtual bool drawCachedBitmap2(const GiGraphics* p, int x = 0, int y = 0, bool secondBmp = false);
    virtual void saveCachedBitmap(bool secondBmp = false);
    virtual bool hasCachedBitmap(bool secondBmp = false) const;
    virtual void clearCachedBitmap();
    virtual bool isBufferedDrawing() const;
    virtual int getGraphType() const { return 10; }
    virtual int getScreenDpi() const;
    
    virtual GiColor getBkColor() const;
    virtual GiColor setBkColor(const GiColor& color);
    virtual GiColor getNearestColor(const GiColor& color) const;
    virtual const GiContext* getCurrentContext() const;
    virtual void _clipBoxChanged(const RECT& clipBox);
    virtual void _antiAliasModeChanged(bool antiAlias);

    virtual bool rawLine(const GiContext* ctx, 
        int x1, int y1, int x2, int y2);
    virtual bool rawPolyline(const GiContext* ctx, 
        const POINT* lppt, int count);
    virtual bool rawPolyBezier(const GiContext* ctx, 
        const POINT* lppt, int count);
    virtual bool rawPolygon(const GiContext* ctx, 
        const POINT* lppt, int count);
    virtual bool rawRect(const GiContext* ctx, 
        int x, int y, int w, int h);
    virtual bool rawEllipse(const GiContext* ctx, 
        int x, int y, int w, int h);
    virtual bool rawPolyDraw(const GiContext* ctx, 
        int count, const POINT* lppt, const UInt8* types);
    
    virtual bool rawBeginPath();
    virtual bool rawEndPath(const GiContext* ctx, bool fill);
    virtual bool rawMoveTo(int x, int y);
    virtual bool rawLineTo(int x, int y);
    virtual bool rawPolyBezierTo(const POINT* lppt, int count);
    virtual bool rawCloseFigure();

private:
    GiGraphIos();
    GiGraphIosImpl*   m_draw;
};

#endif // __GEOMETRY_GRAPHIOS_H_