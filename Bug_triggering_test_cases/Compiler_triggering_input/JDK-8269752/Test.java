// Generated by Java* Fuzzer test generator (1.0.001). Sun Jun 27 21:36:57 2021
public class Test {

    public static final int N = 400;

    public static long instanceCount=3693904402644046771L;
    public static boolean bFld=false;
    public short sFld=18824;
    public static int iArrFld[]=new int[N];
    public double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.iArrFld, -1);
    }

    public static long vMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;
    public static long vMeth2_check_sum = 0;

    public static void vMeth2(int i11) {

        byte by=-102;
        int i12=-39710, i13=4, i14=-34, i15=2176, i16=9, iArr1[]=new int[N];
        float f=39.485F;

        FuzzerUtils.init(iArr1, 16781);

        iArr1[(i11 >>> 1) % N] = by;
        i11 >>= by;
        for (i12 = 7; i12 < 344; i12++) {
            for (i14 = 5; i14 > 1; --i14) {
                f *= i14;
                switch (((i11 >>> 1) % 2) + 105) {
                case 105:
                    i16 = 1;
                    do {
                        Test.bFld = Test.bFld;
                        if (Test.bFld) {
                            i11 -= (int)Test.instanceCount;
                        } else {
                            i13 = i14;
                        }
                        try {
                            i11 = (i16 / i15);
                            i11 = (54 % i15);
                            i15 = (i12 % -28732);
                        } catch (ArithmeticException a_e) {}
                        i11 = (int)Test.instanceCount;
                        Test.instanceCount = i15;
                        i13 = (int)f;
                    } while (++i16 < 2);
                    break;
                case 106:
                    iArr1[i12] -= i16;
                    break;
                default:
                    i13 /= -51;
                }
            }
        }
        vMeth2_check_sum += i11 + by + i12 + i13 + i14 + i15 + Float.floatToIntBits(f) + i16 +
            FuzzerUtils.checkSum(iArr1);
    }

    public static void vMeth1() {

        int i9=6, i10=-1432, i17=60, i18=9;
        byte by1=7;
        boolean b=true;
        double d1=46.31542;

        for (i9 = 187; i9 > 6; i9 -= 3) {
            i10 += (((i9 * i9) + i10) - Test.instanceCount);
            if (i9 != 0) {
                vMeth1_check_sum += i9 + i10 + by1 + (b ? 1 : 0) + Double.doubleToLongBits(d1) + i17 + i18;
                return;
            }
            i10 = (--i10);
            vMeth2(i10);
            Test.iArrFld[i9] -= i9;
            if (b) {
                i10 *= by1;
                if (b) continue;
                if (i10 != 0) {
                    vMeth1_check_sum += i9 + i10 + by1 + (b ? 1 : 0) + Double.doubleToLongBits(d1) + i17 + i18;
                    return;
                }
            } else if (b) {
                d1 = 1;
                while ((d1 += 2) < 26) {
                    for (i17 = 2; 1 < i17; --i17) {
                        i10 <<= 26955;
                        i10 += i9;
                        Test.instanceCount += i10;
                    }
                }
            }
        }
        vMeth1_check_sum += i9 + i10 + by1 + (b ? 1 : 0) + Double.doubleToLongBits(d1) + i17 + i18;
    }

    public static void vMeth(int i2) {

        double d=1.74287;
        int i3=-36665, i4=251, i5=0, i6=5, i7=-132, i8=247, iArr[]=new int[N];
        short s=29533;
        long lArr[]=new long[N];

        FuzzerUtils.init(lArr, -62401009L);
        FuzzerUtils.init(iArr, 41679);

        d += (++i2);
        i3 = 1;
        while (++i3 < 132) {
            if (i2 != 0) {
                vMeth_check_sum += i2 + Double.doubleToLongBits(d) + i3 + i4 + i5 + i6 + s + i7 + i8 +
                    FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
                return;
            }
            i4 = 1;
            while (++i4 < 12) {
                for (i5 = 1; i5 > 1; --i5) {
                    i6 += (Math.min(i2 - i6, i3) * (i2++));
                    i6 -= (int)((++i6) - (Test.instanceCount - (s + i6)));
                    Test.instanceCount += (i5 ^ Test.instanceCount);
                    lArr[i5 - 1] += (long)Double.longBitsToDouble((long)((i3 - i2) - (i2 + 1.817F)));
                    i6 = (int)(((i4 >>> Test.instanceCount) + -16.88768) + i2);
                }
                i2 += i4;
                for (i7 = 1; 1 > i7; ++i7) {
                    i6 += (i7 + i3);
                    s = (short)iArr[i4];
                    vMeth1();
                }
            }
        }
        vMeth_check_sum += i2 + Double.doubleToLongBits(d) + i3 + i4 + i5 + i6 + s + i7 + i8 +
            FuzzerUtils.checkSum(lArr) + FuzzerUtils.checkSum(iArr);
    }

    public void mainTest(String[] strArr1) {

        int i=50812, i1=120, i19=61457, i20=5, i21=12, i22=-52711, i23=235, i24=-10211;
        float f1=-28.52F, fArr[][]=new float[N][N];
        byte by2=-58;
        double d2=-9.109992;
        long lArr1[]=new long[N];

        FuzzerUtils.init(lArr1, 196L);
        FuzzerUtils.init(fArr, 1.159F);

        i = 1;
        do {
            i1 >>= (i1++);
            vMeth(i1);
            for (i19 = 6; i19 < 117; i19 += 2) {
                lArr1 = lArr1;
                if (Test.bFld) {
                    i1 -= -57;
                }
                Test.iArrFld[i + 1] = i19;
                Test.bFld = Test.bFld;
                i1 = i;
                i20 = (int)f1;
            }
            i1 ^= by2;
            sFld -= (short)i20;
            Test.instanceCount = Test.instanceCount;
            for (i21 = 1; i21 < 117; ++i21) {
                Test.instanceCount -= 37397;
                i20 = i23;
                fArr[i + 1][i - 1] += Test.instanceCount;
                i24 = 1;
                while (++i24 < 2) {
                    i23 = i;
                    i1 = -11;
                    i23 ^= i19;
                    i23 |= -40191;
                    i22 = (int)f1;
                    f1 += Test.instanceCount;
                    switch ((i % 5) + 32) {
                    case 32:
                        switch (((i % 9) * 5) + 10) {
                        case 30:
                            lArr1[i - 1] += i20;
                            sFld = (short)i24;
                            break;
                        case 54:
                        case 55:
                            sFld >>= (short)i;
                            break;
                        case 46:
                            i23 >>= i19;
                            break;
                        case 51:
                            sFld -= (short)d2;
                            break;
                        case 35:
                            f1 -= i20;
                            break;
                        case 33:
                            Test.iArrFld[i] = i;
                        case 52:
                            i22 += i;
                            break;
                        case 40:
                            Test.instanceCount = (long)f1;
                            break;
                        default:
                            Test.instanceCount <<= Test.instanceCount;
                        }
                    case 33:
                        dArrFld = dArrFld;
                        break;
                    case 34:
                        i22 -= (int)Test.instanceCount;
                        break;
                    case 35:
                        f1 = Test.instanceCount;
                        break;
                    case 36:
                        Test.instanceCount += i24;
                        break;
                    default:
                        i1 = i23;
                    }
                }
            }
        } while (++i < 214);

        FuzzerUtils.out.println("i i1 i19 = " + i + "," + i1 + "," + i19);
        FuzzerUtils.out.println("i20 f1 by2 = " + i20 + "," + Float.floatToIntBits(f1) + "," + by2);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("i24 d2 lArr1 = " + i24 + "," + Double.doubleToLongBits(d2) + "," +
            FuzzerUtils.checkSum(lArr1));
        FuzzerUtils.out.println("fArr = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.bFld sFld = " + Test.instanceCount + "," + (Test.bFld ? 1 : 0)
            + "," + sFld);
        FuzzerUtils.out.println("Test.iArrFld dArrFld = " + FuzzerUtils.checkSum(Test.iArrFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArrFld)));

        FuzzerUtils.out.println("vMeth2_check_sum: " + vMeth2_check_sum);
        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("vMeth_check_sum: " + vMeth_check_sum);
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
//DEBUG  vMeth ->  vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 vMeth mainTest
//DEBUG  vMeth2 ->  vMeth2 vMeth1 vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}