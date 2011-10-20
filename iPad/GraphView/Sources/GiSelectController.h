// GiSelectController.h
// Copyright (c) 2012, Zhang Yungui <rhcad@hotmail.com>
// License: LGPL, https://github.com/rhcad/graph2d

#import "GiGraphView.h"
#include <Graph2d/mgshapes.h>

@class GiGraphView;

@interface GiSelectController : NSObject<GiMotionHandler> {
    GiGraphView*    _view;
    GiShape*        _selection[100];
    int             _count;
}

- (id)initWithView:(GiGraphView*)view;

@end