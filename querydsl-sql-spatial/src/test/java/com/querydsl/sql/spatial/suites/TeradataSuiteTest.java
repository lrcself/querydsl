package com.querydsl.sql.spatial.suites;

import org.junit.BeforeClass;
import org.junit.experimental.categories.Category;

import com.querydsl.core.testutil.Teradata;
import com.querydsl.sql.Connections;
import com.querydsl.sql.spatial.SpatialBase;
import com.querydsl.sql.spatial.TeradataSpatialTemplates;
import com.querydsl.sql.suites.AbstractSuite;

@Category(Teradata.class)
public class TeradataSuiteTest extends AbstractSuite {

    public static class Spatial extends SpatialBase { }

    @BeforeClass
    public static void setUp() throws Exception {
        Connections.initTeradata();
        Connections.initConfiguration(TeradataSpatialTemplates.builder().newLineToSingleSpace().build());
    }

}
