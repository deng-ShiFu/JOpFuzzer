// Generated by Java* Fuzzer test generator (1.0.001). Mon Apr 10 13:04:26 2023
public class Test {

    public static final int N = 400;

    public static volatile long instanceCount=-13L;
    public static double dFld=1.113995;
    public static byte byFld=123;
    public int iFld=35014;
    public static int iFld1=7;
    public static int iArrFld[]=new int[N];

    static {
        FuzzerUtils.init(Test.iArrFld, 17061);
    }

    public static long vMeth_check_sum = 0;
    public static long fMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i5=133, i6=3, i7=235, i8=253, i9=99, i11=152, i12=-173, i13=-42836, iArr[]=new int[N];
        float f2=91.581F, fArr[]=new float[N];
        short s=7631;
        long lArr[][]=new long[N][N];

        FuzzerUtils.init(iArr, -29);
        FuzzerUtils.init(lArr, 3L);
        FuzzerUtils.init(fArr, 0.249F);

        Test.dFld -= i5;
        Test.instanceCount = Test.byFld;
        for (i6 = 6; i6 < 386; i6 += 3) {
            for (i8 = 1; i8 < 12; i8 += 2) {
                int i10=8;
                i9 = (int)Test.instanceCount;
                switch (((i6 % 2) * 5) + 49) {
                case 53:
                    iArr[i6] *= (int)Test.instanceCount;
                    i10 -= (int)47.100424;
                    for (i11 = 1; i11 < 3; ++i11) {
                        lArr[i8] = lArr[(i11 >>> 1) % N];
                        Test.instanceCount = i8;
                    }
                    for (f2 = 1; 3 > f2; ++f2) {
                        fArr[i6 + 1] -= s;
                    }
                    break;
                case 54:
                    try {
                        i10 = (22460 / i8);
                        i12 = (-32175 % i8);
                        i5 = (i10 % i13);
                    } catch (ArithmeticException a_e) {}
                    if (i9 != 0) {
                        vMeth1_check_sum += i5 + i6 + i7 + i8 + i9 + i11 + i12 + Float.floatToIntBits(f2) + i13 + s +
                            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr) +
                            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
                        return;
                    }
                }
            }
        }
        vMeth1_check_sum += i5 + i6 + i7 + i8 + i9 + i11 + i12 + Float.floatToIntBits(f2) + i13 + s +
            FuzzerUtils.checkSum(iArr) + FuzzerUtils.checkSum(lArr) +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static float fMeth(int i1, int i2) {

        float f1=0.970F;
        int i3=-55009, i4=-49624, i14=-100, i15=-2, i16=47, i17=-2, i18=74, i19=3, iArr1[]=new int[N];
        boolean b=false;

        FuzzerUtils.init(iArr1, -54666);

        Test.instanceCount -= (long)(f1--);
        for (i3 = 283; i3 > 10; --i3) {
            vMeth1();
            for (i14 = 1; i14 < 6; ++i14) {
                Test.dFld %= ((long)(Test.dFld) | 1);
                i4 += i14;
                for (i16 = 1; i16 < 2; i16++) {
                    iArr1[i14 - 1] += i3;
                    b = b;
                    f1 = 4;
                    i17 %= (int)(i15 | 1);
                }
            }
            try {
                i15 = (Test.iArrFld[i3] % -59);
                iArr1[i3 - 1] = (i14 / iArr1[i3]);
                i2 = (i3 / 160);
            } catch (ArithmeticException a_e) {}
            for (i18 = i3; i18 < 6; i18++) {
                i1 += i18;
                i2 = (int)Test.instanceCount;
            }
        }
        long meth_res = i1 + i2 + Float.floatToIntBits(f1) + i3 + i4 + i14 + i15 + i16 + i17 + (b ? 1 : 0) + i18 + i19
            + FuzzerUtils.checkSum(iArr1);
        fMeth_check_sum += meth_res;
        return (float)meth_res;
    }

    public static void vMeth(int i) {

        float f=0.306F, fArr1[]=new float[N];
        boolean b1=true;
        int i20=-8, i21=-3186, i22=9, i23=40;

        FuzzerUtils.init(fArr1, -89.781F);

        Test.dFld += (((i * f) + fMeth(i, i)) * Test.instanceCount);
        Test.iArrFld[(-13 >>> 1) % N] -= (int)Test.instanceCount;
        Test.instanceCount *= i;
        i >>= i;
        i += i;
        Test.instanceCount >>>= i;
        b1 = b1;
        for (i20 = 5; i20 < 131; i20++) {
            i21 = i20;
            if (b1) {
                i21 = i21;
                i21 += i21;
            }
            for (i22 = 1; i22 < 12; i22++) {
                i23 ^= i21;
            }
            fArr1[i20 + 1] = i;
        }
        vMeth_check_sum += i + Float.floatToIntBits(f) + (b1 ? 1 : 0) + i20 + i21 + i22 + i23 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1));
    }

    public void mainTest(String[] strArr1) {

        int i24=35246, i25=-18, i26=7, i27=-86, i28=-21178, i29=-1, i30=57026;
        float f3=-11.725F, fArr2[]=new float[N];
        short s1=29816;

        FuzzerUtils.init(fArr2, -61.35F);

        vMeth(iFld);
        iFld &= iFld;
        Test.instanceCount = iFld;
        iFld = (int)Test.instanceCount;
        i24 = 1;
        while (++i24 < 233) {
            for (i25 = 4; 108 > i25; ++i25) {
                for (i27 = 1; i27 < 2; ++i27) {
                    byte by=0;
                    switch ((((Test.iFld1 >>> 1) % 6) * 5) + 48) {
                    case 57:
                        iFld += i27;
                        i28 = i26;
                        i26 = 53;
                        Test.byFld >>= (byte)1622;
                    case 55:
                        i26 = iFld;
                        Test.instanceCount += (-54991 + (i27 * i27));
                        switch ((i27 % 10) + 77) {
                        case 77:
                            i26 >>>= i25;
                            i26 <<= i28;
                        case 78:
                            iFld = i25;
                            i28 = (int)Test.instanceCount;
                            fArr2[i24 + 1] = i29;
                            i28 *= iFld;
                            break;
                        case 79:
                            i30 += i27;
                            break;
                        case 80:
                            i29 = i28;
                            switch ((i24 % 8) + 120) {
                            case 120:
                                Test.byFld = (byte)i30;
                                Test.instanceCount = i24;
                                Test.dFld += 1.120840;
                                by += (byte)f3;
                                break;
                            case 121:
                                Test.iArrFld[i25] = i26;
                                i26 += (i27 ^ iFld);
                                break;
                            case 122:
                                i28 = i29;
                                break;
                            case 123:
                                f3 -= Test.iFld1;
                                break;
                            case 124:
                                Test.instanceCount = i28;
                                break;
                            case 125:
                            case 126:
                                i26 = iFld;
                                break;
                            case 127:
                                Test.iArrFld = Test.iArrFld;
                                break;
                            }
                            break;
                        case 81:
                            s1 += (short)(i27 + Test.instanceCount);
                        case 82:
                            Test.instanceCount *= -1601;
                        case 83:
                            i26 += (((i27 * i24) + Test.instanceCount) - f3);
                            break;
                        case 84:
                            Test.iArrFld[i24 + 1] |= (int)Test.instanceCount;
                        case 85:
                            i30 += (i27 ^ i26);
                            break;
                        case 86:
                            Test.dFld = Test.iFld1;
                            break;
                        }
                        break;
                    case 71:
                        fArr2[i24] += s1;
                        break;
                    case 49:
                        Test.instanceCount <<= i26;
                        break;
                    case 52:
                        i26 <<= i27;
                        break;
                    case 58:
                        f3 -= i29;
                    default:
                        i28 += Test.iFld1;
                    }
                }
            }
        }

        FuzzerUtils.out.println("i24 i25 i26 = " + i24 + "," + i25 + "," + i26);
        FuzzerUtils.out.println("i27 i28 i29 = " + i27 + "," + i28 + "," + i29);
        FuzzerUtils.out.println("i30 f3 s1 = " + i30 + "," + Float.floatToIntBits(f3) + "," + s1);
        FuzzerUtils.out.println("fArr2 = " + Double.doubleToLongBits(FuzzerUtils.checkSum(fArr2)));

        FuzzerUtils.out.println("Test.instanceCount Test.dFld Test.byFld = " + Test.instanceCount + "," +
            Double.doubleToLongBits(Test.dFld) + "," + Test.byFld);
        FuzzerUtils.out.println("iFld Test.iFld1 Test.iArrFld = " + iFld + "," + Test.iFld1 + "," +
            FuzzerUtils.checkSum(Test.iArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("fMeth_check_sum: " + fMeth_check_sum);
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
//DEBUG  fMeth ->  fMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 fMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}