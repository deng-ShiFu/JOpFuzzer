// Generated by Java* Fuzzer test generator (1.0.001). Mon Apr 10 13:03:48 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=3547407663324869895L;
    public static int iFld=150;
    public static float fFld=73.939F;
    public static int iFld1=42588;
    public boolean bFld=false;
    public static double dArrFld[][]=new double[N][N];

    static {
        FuzzerUtils.init(Test.dArrFld, -1.72401);
    }

    public static long sMeth_check_sum = 0;
    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;

    public static int iMeth() {

        int i3=-6583, i4=-109, i5=-16849, i6=7873, i7=-11512, iArr1[]=new int[N];
        long l1=-3792235040353943801L;
        double d=-92.109918;
        short s1=-23916;

        FuzzerUtils.init(iArr1, 15989);

        Test.iFld -= Test.iFld;
        Test.fFld = Test.iFld;
        Test.iFld -= Test.iFld;
        for (i3 = 6; 162 > i3; i3++) {
            i4 += (int)Test.instanceCount;
            Test.fFld -= Test.iFld;
            Test.iFld += (-16705 + (i3 * i3));
            Test.iFld += i3;
            for (i5 = 1; i5 < 10; ++i5) {
                Test.instanceCount = Test.iFld;
                for (l1 = i5; l1 < 2; l1++) {
                    iArr1[i3 - 1] = i4;
                    i4 = (int)l1;
                    d -= i7;
                    Test.iFld += (int)(((l1 * s1) + i4) - i4);
                }
            }
        }
        long meth_res = i3 + i4 + i5 + i6 + l1 + i7 + Double.doubleToLongBits(d) + s1 + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(int i2) {

        long l2=1213398065L, lArr[]=new long[N];
        int i8=-50108, i9=13, i10=-196, iArr[]=new int[N];
        double d1=-1.101963;
        boolean b=true;

        FuzzerUtils.init(iArr, 7962);
        FuzzerUtils.init(lArr, 4300315213664202134L);

        i2 -= Math.min((i2 + i2) - (--i2), iArr[(239 >>> 1) % N]);
        lArr[(i2 >>> 1) % N] = (Math.max(i2 + i2, (int)(379837165622541896L - (i2 - i2))) - ((-iMeth()) + Test.iFld));
        l2 = 1;
        do {
            i8 = 1;
            do {
                iArr[i8] += 27554;
                i2 = Test.iFld;
            } while (++i8 < 7);
        } while (++l2 < 235);
        d1 = Test.fFld;
        for (i9 = 2; 339 > i9; ++i9) {
            i2 = 6;
            Test.iFld += (i9 * i9);
            if (b) {
                vMeth_check_sum += i2 + l2 + i8 + Double.doubleToLongBits(d1) + i9 + i10 + (b ? 1 : 0) +
                    FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
                return;
            } else if (b) {
                try {
                    Test.iFld = (103 / i9);
                    Test.iFld = (i10 % -21217);
                    Test.iFld1 = (i2 % -1808469251);
                } catch (ArithmeticException a_e) {}
                iArr[i9 + 1] += i8;
                Test.instanceCount += Test.instanceCount;
            } else {
                Test.instanceCount = i8;
            }
        }
        vMeth_check_sum += i2 + l2 + i8 + Double.doubleToLongBits(d1) + i9 + i10 + (b ? 1 : 0) +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr);
    }

    public static short sMeth(int i1, long l) {

        int i11=-9024, i12=-71, i13=-3, i14=-218, i15=84, iArr2[]=new int[N];
        double d2=1.32644, dArr[]=new double[N];
        long lArr1[][]=new long[N][N];
        float fArr[]=new float[N];

        FuzzerUtils.init(iArr2, -20878);
        FuzzerUtils.init(lArr1, 1112535986L);
        FuzzerUtils.init(dArr, 58.6851);
        FuzzerUtils.init(fArr, -94.99F);

        vMeth(i1);
        for (i11 = 185; 9 < i11; i11 -= 2) {
            try {
                Test.iFld1 = (-40920 % Test.iFld1);
                Test.iFld1 = (Test.iFld1 % i1);
                i12 = (414135672 / iArr2[i11]);
            } catch (ArithmeticException a_e) {}
            for (i13 = 1; i13 < 18; i13++) {
                Test.iFld = -4579;
                for (d2 = 1; d2 < 2; ++d2) {
                    i1 += (int)(((d2 * i12) + Test.fFld) - i11);
                    lArr1[(int)(d2 + 1)][(int)(d2 - 1)] ^= i13;
                    i12 ^= i11;
                    iArr2[(int)(d2 - 1)] += i11;
                    dArr[i13 - 1] = i12;
                    Test.fFld = 1491471219L;
                    i1 += (int)(((d2 * Test.instanceCount) + Test.fFld) - i15);
                    fArr[(int)(d2)] = i12;
                    l *= Test.iFld1;
                }
            }
        }
        long meth_res = i1 + l + i11 + i12 + i13 + i14 + Double.doubleToLongBits(d2) + i15 +
            FuzzerUtils.checkSum(iArr2) + FuzzerUtils.checkSum(lArr1) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
        sMeth_check_sum += meth_res;
        return (short)meth_res;
    }

    public void mainTest(String[] strArr1) {

        short s=-15534;
        int i=96, i16=-168, i17=-233, i18=-14, i19=43, i20=5, i21=196, iArr3[]=new int[N];
        double d3=0.40847, d4=0.8320;
        long l3=-55987L;
        byte by=-65;

        FuzzerUtils.init(iArr3, -95);

        s -= (short)(((++i) - i) + sMeth(Test.iFld1, Test.instanceCount));
        Test.iFld *= (int)Test.fFld;
        for (i16 = 11; i16 < 345; ++i16) {
            d3 -= d3;
            Test.instanceCount = Test.iFld1;
            switch (((i >>> 1) % 10) + 108) {
            case 108:
                Test.instanceCount = (long)42.274F;
                break;
            case 109:
                d4 = 1;
                do {
                    i17 = i;
                    switch ((int)(((d4 % 1) * 5) + 14)) {
                    case 19:
                        for (i18 = 1; i18 < 1; i18++) {
                            i17 *= (int)Test.instanceCount;
                            i19 -= i;
                            i *= (int)d4;
                        }
                        i += (18 + (d4 * d4));
                        iArr3[(int)(d4)] *= (int)5L;
                        try {
                            i19 = (Test.iFld / -207);
                            iArr3[i16 - 1] = (i19 % iArr3[i16 - 1]);
                            i17 = (iArr3[(int)(d4 + 1)] % i17);
                        } catch (ArithmeticException a_e) {}
                    default:
                        Test.iFld1 = Test.iFld;
                    }
                } while (++d4 < 75);
            case 110:
                i17 *= i16;
                if (bFld) {
                    i20 = 1;
                    while (++i20 < 75) {
                        for (l3 = 1; l3 < 1; ++l3) {
                            Test.dArrFld[i20] = Test.dArrFld[i16];
                            try {
                                iArr3[i20 + 1] = (Test.iFld / 749770059);
                                iArr3[i20 - 1] = (iArr3[(int)(l3)] % 25079);
                                i17 = (Test.iFld / Test.iFld1);
                            } catch (ArithmeticException a_e) {}
                            Test.iFld -= (int)Test.fFld;
                        }
                        i17 = i18;
                    }
                    Test.iFld += by;
                } else if (bFld) {
                    bFld = bFld;
                    if (bFld) continue;
                }
                i19 = Test.iFld;
                break;
            case 111:
                i21 += (i16 * i16);
                break;
            case 112:
                try {
                    Test.iFld = (i / i);
                    i21 = (31561 % i19);
                    Test.iFld1 = (i % 247);
                } catch (ArithmeticException a_e) {}
                break;
            case 113:
            case 114:
                iArr3 = iArr3;
                break;
            case 115:
                i19 -= -1;
                break;
            case 116:
                i21 = s;
            case 117:
                Test.iFld1 += (int)Test.instanceCount;
            default:
                i *= i16;
            }
        }

        FuzzerUtils.out.println("s i i16 = " + s + "," + i + "," + i16);
        FuzzerUtils.out.println("i17 d3 d4 = " + i17 + "," + Double.doubleToLongBits(d3) + "," +
            Double.doubleToLongBits(d4));
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("l3 i21 by = " + l3 + "," + i21 + "," + by);
        FuzzerUtils.out.println("iArr3 = " + FuzzerUtils.checkSum(iArr3));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.fFld = " + Test.instanceCount + "," + Test.iFld +
            "," + Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.iFld1 bFld Test.dArrFld = " + Test.iFld1 + "," + (bFld ? 1 : 0) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));

        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
        FuzzerUtils.out.println("sMeth_check_sum: " + sMeth_check_sum);
    }
    public static void main(String[] strArr) {

        try {
            Test _instance = new Test();
            for (int i = 0; i < 10; i++ ) {
                _instance.mainTest(strArr);
            }
         } catch (Exception ex) {
            FuzzerUtils.out.println(ex.getClass().getCanonicalName());
         }
    }
}
///////////////////////////////////////////////////////////////////////
//DEBUG  Test ->  Test
//DEBUG  main ->  main
//DEBUG  mainTest ->  mainTest
//DEBUG  sMeth ->  sMeth mainTest
//DEBUG  vMeth ->  vMeth sMeth mainTest
//DEBUG  iMeth ->  iMeth vMeth sMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}