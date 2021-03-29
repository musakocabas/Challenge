package com.mek;

public class PaintJob {

    public static int getBucketCount(double widht ,double height ,double areaPerBucket ,int extraBuckets){
        return (widht<=0||height<=0||areaPerBucket<=0 || extraBuckets <0) ?  -1 : ((int)Math.ceil((widht*height)/areaPerBucket)) - extraBuckets ;
    }
    public static int getBucketCount(double widht ,double height ,double areaPerBucket){
        return (widht<=0||height<=0||areaPerBucket<=0) ?  -1 : ((int)Math.ceil((widht*height)/areaPerBucket)) ;
    }
    public static int getBucketCount(double area,double areaPerBucket){
        return (area<=0||areaPerBucket<=0) ?  -1 : ((int)Math.ceil(area/areaPerBucket)) ;
    }
}
