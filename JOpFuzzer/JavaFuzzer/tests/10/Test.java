// Generated by Java* Fuzzer test generator (1.0.001). Mon Apr 10 13:04:26 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-13L;
    public static int iFld=-14176;
    public static boolean bFld=false;
    public static short sFld=-29694;
    public static int iFld1=16967;
    public static float fFld=53.355F;
    public static byte byFld=-125;
    public volatile double dFld=27.13583;
    public static long lArrFld[][]=new long[N][N];
    public int iArrFld[]=new int[N];
    public float fArrFld[][]=new float[N][N];
    public static double dArrFld[]=new double[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -3227737406473084695L);
        FuzzerUtils.init(Test.dArrFld, 2.82017);
    }

    public static long iMeth_check_sum = 0;
    public static long iMeth1_check_sum = 0;
    public static long fMeth_check_sum = 0;

    public static float fMeth(float f2, int i8) {

        int i9=221, i10=-5, i11=26, i12=7098, i13=-9, iArr[]=new int[N];
        double d1=108.87799, dArr[]=new double[N];
        byte by1=-59;
        float fArr[]=new float[N];

        FuzzerUtils.init(dArr, 0.22059);
        FuzzerUtils.init(fArr, -52.676F);
        FuzzerUtils.init(iArr, -133);

        i9 = 1;
        while (++i9 < 361) {
            for (i10 = 1; i10 < 5; ++i10) {
                for (i12 = 1; 2 > i12; i12++) {
                    i8 &= (int)Test.instanceCount;
                    i11 >>= i10;
                    switch (((i12 % 7) * 5) + 116) {
                    case 147:
                        Test.instanceCount += i12;
                        i11 |= (int)Test.instanceCount;
                        i11 = -793;
                        break;
                    case 141:
                        f2 *= (float)d1;
                        d1 = -2.669F;
                        switch ((i12 % 9) + 110) {
                        case 110:
                            if (Test.bFld) break;
                            d1 = 1626;
                            i11 += (i12 * i12);
                            break;
                        case 111:
                            i8 -= (int)d1;
                        case 112:
                            f2 += (i12 + f2);
                            break;
                        case 113:
                            Test.iFld = (int)d1;
                            break;
                        case 114:
                            i8 += (-206 + (i12 * i12));
                            break;
                        case 115:
                            dArr[(i12 >>> 1) % N] *= Test.instanceCount;
                            break;
                        case 116:
                            i13 = (int)26.364F;
                            break;
                        case 117:
                            i13 += i13;
                            break;
                        case 118:
                            i8 += (((i12 * i13) + i10) - i12);
                        default:
                            i11 = -7;
                        }
                        break;
                    case 129:
                        fArr = fArr;
                    case 126:
                        d1 = i12;
                        break;
                    case 128:
                        iArr[i12 - 1] -= (int)f2;
                    case 151:
                        Test.sFld = (short)Test.instanceCount;
                        break;
                    case 118:
                        by1 = (byte)-128;
                    }
                }
            }
        }
        long meth_res = Float.floatToIntBits(f2) + i8 + i9 + i10 + i11 + i12 + i13 + Double.doubleToLongBits(d1) + by1
            + Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)) + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr))
            + FuzzerUtils.checkSum(iArr);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static int iMeth1(double d, int i, int i1) {

        int i2=9, i3=-12117, i4=3, i5=44813, i6=62740, i7=168, iArr1[]=new int[N];
        float f1=-2.808F;
        byte by=45;
        short sArr[]=new short[N];

        FuzzerUtils.init(sArr, (short)-4075);
        FuzzerUtils.init(iArr1, 1);

        for (i2 = 2; i2 < 135; ++i2) {
            Test.bFld = (((i2 - i1) >= (i * Test.sFld)) ^ (Test.bFld = (i != Test.instanceCount)));
            for (i4 = 1; i4 < 12; ++i4) {
                f1 += (Test.instanceCount *= ((-4 - (-2667 - (++Test.sFld))) | (by++)));
                switch (((i2 % 1) * 5) + 98) {
                case 101:
                    switch (((i4 % 2) * 5) + 94) {
                    case 104:
                        switch (((Test.iFld >>> 1) % 1) + 7) {
                        case 7:
                            f1 += (-(~(long)(-204 - (i3 + f1))));
                            for (i6 = 1; i6 < 2; i6++) {
                                Test.instanceCount *= (long)(fMeth(2.753F, i1) + i2);
                                switch ((i6 % 2) + 75) {
                                case 75:
                                    sArr[i6] += (short)Test.instanceCount;
                                    i1 -= i6;
                                    iArr1[i2] *= -175;
                                case 76:
                                    i1 = i4;
                                    break;
                                default:
                                    Test.instanceCount -= Test.instanceCount;
                                }
                            }
                            break;
                        }
                        break;
                    case 100:
                        i5 += (int)f1;
                        break;
                    }
                    break;
                }
            }
        }
        long meth_res = Double.doubleToLongBits(d) + i + i1 + i2 + i3 + i4 + i5 + Float.floatToIntBits(f1) + by + i6 +
            i7 + FuzzerUtils.checkSum(sArr) + FuzzerUtils.checkSum(iArr1);
        iMeth1_check_sum += meth_res;
        return (int)meth_res;
    }

    public int iMeth(float f) {

        double d2=-65.126957;
        int i14=58052, i15=14107, i16=-12;

        Test.lArrFld[(-215 >>> 1) % N][(Test.iFld >>> 1) % N] *= (Test.iFld * Test.iFld);
        Test.iFld >>= ((Test.iFld + (--Test.iFld)) + iMeth1(d2, Test.iFld1, Test.iFld1));
        iArrFld = iArrFld;
        switch (((1 >>> 1) % 2) + 110) {
        case 110:
            fArrFld[(Test.iFld >>> 1) % N][(Test.iFld1 >>> 1) % N] += 52652;
            break;
        case 111:
            iArrFld[(Test.iFld1 >>> 1) % N] |= Test.iFld;
            iArrFld[(Test.iFld1 >>> 1) % N] -= (int)f;
            Test.instanceCount = Test.iFld1;
            i14 = 1;
            while (++i14 < 274) {
                for (i15 = 1; i15 < 6; i15++) {
                    Test.iFld1 *= (int)f;
                    Test.iFld = Test.iFld1;
                }
                if (Test.bFld) {
                    Test.lArrFld[(Test.iFld >>> 1) % N][i14] -= Test.sFld;
                    Test.iFld1 >>>= i14;
                } else if (Test.bFld) {
                    Test.dArrFld[i14 + 1] += Test.iFld;
                } else {
                    d2 -= i14;
                }
            }
            break;
        default:
            iArrFld[(Test.iFld >>> 1) % N] = (int)Test.instanceCount;
        }
        long meth_res = Float.floatToIntBits(f) + Double.doubleToLongBits(d2) + i14 + i15 + i16;
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public void mainTest(String[] strArr1) {

        int i17=-29247, i18=-39092, i19=-8, i20=-48050, i21=-24824, i22=-44242, i23=50136;

        switch (((iMeth(Test.fFld) >>> 1) % 1) + 92) {
        case 92:
            for (i17 = 8; i17 < 134; i17++) {
                for (i19 = 199; i19 > 11; i19 -= 3) {
                    Test.instanceCount += (((i19 * i18) + i18) - i18);
                    Test.sFld *= (short)Test.fFld;
                    i20 -= Test.sFld;
                    iArrFld[i19 - 1] <<= Test.byFld;
                    Test.iFld1 = i21;
                    Test.fFld = Test.fFld;
                    iArrFld[i17] >>= (int)Test.instanceCount;
                    for (i22 = 1; i22 < 4; ++i22) {
                        if (Test.bFld) break;
                        switch (((i17 >>> 1) % 7) + 43) {
                        case 43:
                            i20 = i19;
                            Test.instanceCount *= Test.iFld1;
                            Test.instanceCount <<= i17;
                            Test.instanceCount = -1042038264L;
                        case 44:
                            Test.iFld = i18;
                            break;
                        case 45:
                            fArrFld[i22 + 1][i17] += i19;
                            Test.iFld1 *= 40612;
                            break;
                        case 46:
                            if (Test.bFld) {
                                Test.fFld = i20;
                            } else if (Test.bFld) {
                                i20 = Test.iFld1;
                                Test.fFld = Test.byFld;
                                Test.instanceCount &= i18;
                            } else if (Test.bFld) {
                                Test.iFld1 -= 11;
                            } else {
                                dFld /= 1.377F;
                                Test.instanceCount += (((i22 * Test.instanceCount) + i19) - i21);
                            }
                            Test.instanceCount -= 3;
                            i20 += (((i22 * Test.instanceCount) + Test.instanceCount) - i21);
                            break;
                        case 47:
                            i23 = -5;
                            break;
                        case 48:
                            i23 += (i22 * i20);
                        case 49:
                            Test.fFld = (float)21.98071;
                            break;
                        default:
                            Test.byFld = (byte)70.633F;
                        }
                    }
                }
            }
            break;
        }

        FuzzerUtils.out.println("i17 i18 i19 = " + i17 + "," + i18 + "," + i19);
        FuzzerUtils.out.println("i20 i21 i22 = " + i20 + "," + i21 + "," + i22);
        FuzzerUtils.out.println("i23 = " + i23);

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.bFld = " + Test.instanceCount + "," + Test.iFld +
            "," + (Test.bFld ? 1 : 0));
        FuzzerUtils.out.println("Test.sFld Test.iFld1 Test.fFld = " + Test.sFld + "," + Test.iFld1 + "," +
            Float.floatToIntBits(Test.fFld));
        FuzzerUtils.out.println("Test.byFld dFld Test.lArrFld = " + Test.byFld + "," + Double.doubleToLongBits(dFld) +
            "," + FuzzerUtils.checkSum(Test.lArrFld));
        FuzzerUtils.out.println("iArrFld fArrFld Test.dArrFld = " + FuzzerUtils.checkSum(iArrFld) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArrFld)) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(Test.dArrFld)));

        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
        FuzzerUtils.out.println("iMeth1_check_sum: " + iMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth mainTest
//DEBUG  iMeth1 ->  iMeth1 iMeth mainTest
//DEBUG  fMeth ->  fMeth iMeth1 iMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}
