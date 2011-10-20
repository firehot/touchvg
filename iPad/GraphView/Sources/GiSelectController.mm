// GiSelectController.mm
// Copyright (c) 2012, Zhang Yungui <rhcad@hotmail.com>
// License: LGPL, https://github.com/rhcad/graph2d

#import "GiSelectController.h"
#include <Graph2d/gigraph.h>

@interface GiSelectController(Internal)

- (BOOL)hitTest:(GiShape**)shapeFound point:(CGPoint)point;
- (void)addToSelection:(GiShape*)shape;

@end

@implementation GiSelectController

- (id)initWithView:(GiGraphView*)view
{
    self = [super init];
    if (self) {
        _view = view;
        _count = 0;
    }
    return self;
}

- (void)dealloc
{
    [super dealloc];
}

- (void)dynDraw:(GiGraphics*)gs
{
    GiContext context(-4, GiColor(0, 0, 255, 55));
    
    for (int i = 0; i < _count; i++) {
        _selection[i]->draw(*gs, &context);
    }
}

- (BOOL)undoMotion
{
    if (_count > 0) {
        _count = 0;
        [_view setNeedsDisplay];
    }
    
    return YES;
}

- (BOOL)twoFingersPinch:(UIPinchGestureRecognizer *)sender
{
    return NO;
}

- (BOOL)twoFingersPan:(UIPanGestureRecognizer *)sender
{
    return NO;
}

- (BOOL)twoFingersTwoTaps:(UITapGestureRecognizer *)sender
{
    return NO;
}

- (BOOL)oneFingerPan:(UIPanGestureRecognizer *)sender
{
    return NO;
}

- (BOOL)oneFingerTwoTaps:(UITapGestureRecognizer *)sender
{
    return NO;
}

- (BOOL)oneFingerOneTap:(UITapGestureRecognizer *)sender
{
    GiShape *shape = NULL;
    
    if ([self hitTest:&shape point:[sender locationInView:sender.view]]) {
        _count = 0;
        [self addToSelection:shape];
    }
    else if (_count > 0) {
        _count = 0;
        [sender.view setNeedsDisplay];
    }
    
    return YES;
}

@end

@implementation GiSelectController(Internal)

- (void)addToSelection:(GiShape*)shape
{
    if (_count < 100) {
        _selection[_count] = shape;
        _count++;
        [_view setNeedsDisplay];
    }
}

- (BOOL)hitTest:(GiShape**)shapeFound point:(CGPoint)point
{
    Box2d limits(Box2d(Point2d(point.x, point.y), 50, 50) * _view.xform->displayToModel());
    Point2d ptNear;
    Int32 segment;
    
    *shapeFound = _view.shapes->hitTest(limits, ptNear, segment);
    
    return *shapeFound != NULL;
}

@end