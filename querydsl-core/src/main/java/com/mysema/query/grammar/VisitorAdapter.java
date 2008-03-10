/*
 * Copyright (c) 2008 Mysema Ltd.
 * All rights reserved.
 * 
 */
package com.mysema.query.grammar;

import com.mysema.query.grammar.Types.*;

/**
 * VisitorAdapter provides a base implementation where invocations are
 * dispatched to supertypes when available and visible
 * 
 * @author tiwe
 * @version $Id$
 */
public abstract class VisitorAdapter<V extends VisitorAdapter<V>> extends
        Visitor<V> {

    @Override
    protected void visit(AliasEntityCollection<?> expr) {
        visit((Alias<?>) expr);
    }
    @Override
    protected void visit(AliasEntity<?> expr) {
        visit((Alias<?>) expr);
    }
    @Override
    protected void visit(AliasNoEntity<?> expr) {
        visit((Alias<?>) expr);
    }
    @Override
    protected void visit(OperationBoolean expr) {
        visit((Operation<?, ?>) expr);
    }
    @Override
    protected void visit(OperationComparable<?,?> expr) {
        visit((Operation<?, ?>) expr);
    }
    @Override
    protected void visit(OperationNumber<?,?> expr) {
        visit((Operation<?, ?>) expr);
    }
    @Override
    protected void visit(OperationString expr) {
        visit((Operation<?, ?>) expr);
    }
    @Override
    protected void visit(PathBoolean expr) {
        visit((Path<?>) expr);
    }
    @Override
    protected void visit(PathComparable<?> expr) {
        visit((Path<?>) expr);
    }
    @Override
    protected void visit(PathComponentCollection<?> expr) {
        visit((Path<?>) expr);
    }
    @Override
    protected void visit(PathComponentMap<?,?> expr) {
        visit((Path<?>) expr);
    }    
    @Override
    protected void visit(PathString expr) {
        visit((Path<?>) expr);
    }    
    @Override
    protected void visit(PathEntity<?> expr) {
        visit((Path<?>) expr);
    }    
    @Override
    protected void visit(PathEntityRenamable<?> expr) {
        visit((PathEntity<?>) expr);
    }
    @Override
    protected void visit(PathEntityCollection<?> expr) {
        visit((Path<?>) expr);
    }
    @Override
    protected void visit(PathEntityMap<?,?> expr) {
        visit((Path<?>) expr);
    }
    @Override
    protected void visit(PathNoEntity<?> expr) {
        visit((Path<?>) expr);
    }
    @Override
    protected void visit(PathNoEntitySimple<?> expr) {
        visit((Path<?>) expr);
    }
}
