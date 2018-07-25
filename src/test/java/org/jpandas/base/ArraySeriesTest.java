package org.jpandas.base;

import org.jpandas.api.Series;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

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

    @Test
    public void ilocByPositionReturnsValueAtIndexPosition(){
        Integer [] data = {50, 40, 30, 20, 10};

        Series<Integer,Integer> s = new ArraySeries<>(data);

        Assert.assertEquals(50, s.iloc(0).intValue());
        Assert.assertEquals(40, s.iloc(1).intValue());
        Assert.assertEquals(30, s.iloc(2).intValue());
        Assert.assertEquals(20, s.iloc(3).intValue());
        Assert.assertEquals(10, s.iloc(4).intValue());
    }

    @Test
    public void ilocByListReturnsSeriesOfValuesOfCorrespondingPositions(){
        Integer [] data = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};

        Series<Integer,Integer> s = new ArraySeries<>(data);

        Series<Integer,Integer> t = s.iloc(Arrays.asList(0, 1, 3, 5, 9));

        Assert.assertNotNull(t);

        Assert.assertEquals(100, s.iloc(0).intValue());
        Assert.assertEquals(90, s.iloc(1).intValue());
        Assert.assertEquals(70, s.iloc(2).intValue());
        Assert.assertEquals(50, s.iloc(3).intValue());
        Assert.assertEquals(10, s.iloc(4).intValue());
    }
}

