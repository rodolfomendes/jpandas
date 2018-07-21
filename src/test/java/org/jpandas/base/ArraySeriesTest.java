package org.jpandas.base;

import org.jpandas.api.Series;
import org.junit.Assert;
import org.junit.Test;

public class ArraySeriesTest {
    @Test
    public void getTest(){
        Integer [] data = {50, 40, 30, 20, 10};

        Series<Integer,Integer> s = new ArraySeries<>(data);

        Assert.assertEquals(50, s.get(0).intValue());
        Assert.assertEquals(40, s.get(1).intValue());
        Assert.assertEquals(30, s.get(2).intValue());
        Assert.assertEquals(20, s.get(3).intValue());
        Assert.assertEquals(10, s.get(4).intValue());
    }

    @Test
    public void getKeyUnderLowerBoundReturnsDefaultValue(){
        Integer [] data = {50, 40, 30, 20, 10};
        Series<Integer,Integer> s = new ArraySeries<>(data);

        Assert.assertEquals(0, s.get(-1, 0).intValue());
    }

    @Test
    public void getKeyOverHigherBoundReturnsDefaultValue(){
        Integer [] data = {50, 40, 30, 20, 10};
        Series<Integer,Integer> s = new ArraySeries<>(data);

        Assert.assertEquals(100, s.get(5, 100).intValue());
    }

    @Test
    public void getKeyUnderLowerBoundReturnsNull(){
        Integer [] data = {50, 40, 30, 20, 10};
        Series<Integer,Integer> s = new ArraySeries<>(data);

        Assert.assertNull(s.get(-1));
    }

    @Test
    public void getKeyOverHigherBoundReturnsNull(){
        Integer [] data = {50, 40, 30, 20, 10};
        Series<Integer,Integer> s = new ArraySeries<>(data);

        Assert.assertNull(s.get(5));
    }
}

