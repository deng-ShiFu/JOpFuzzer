// Generated by Java* Fuzzer test generator (1.0.001). Mon Apr 10 13:03:47 2023
public class Test {

    public static final int N = 400;

    public static long instanceCount=-2L;
    public static int iFld=-33731;
    public static int iFld1=16589;
    public static volatile double dFld=0.36701;
    public static volatile float fFld=-2.905F;
    public static long lArrFld[]=new long[N];

    static {
        FuzzerUtils.init(Test.lArrFld, -1181113078L);
    }

    public static long vMeth_check_sum = 0;
    public static long iMeth_check_sum = 0;
    public static long vMeth1_check_sum = 0;

    public static void vMeth1() {

        int i4=6639, i5=-13, i6=37803, i7=-179, i8=-93;
        boolean b=false;
        float f1=-7.814F, fArr[][]=new float[N][N];
        short s=14669;

        FuzzerUtils.init(fArr, -1.691F);

        i4 = 272;
        while (--i4 > 0) {
            Test.iFld += (((i4 * Test.iFld) + Test.instanceCount) - i4);
            Test.iFld *= Test.iFld;
            Test.instanceCount = -12076;
            for (i5 = 1; i5 < 6; ++i5) {
                if (b) continue;
                f1 -= 48;
            }
            fArr[i4 + 1][i4 + 1] = -7639;
            if (true) break;
            Test.iFld >>= i6;
            Test.iFld = s;
            s = (short)Test.instanceCount;
        }
        for (i7 = 7; i7 < 374; ++i7) {
            i6 = Test.iFld;
            Test.iFld += (-168 + (i7 * i7));
        }
        vMeth1_check_sum += i4 + i5 + i6 + (b ? 1 : 0) + Float.floatToIntBits(f1) + s + i7 + i8 +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr));
    }

    public static int iMeth(byte by, int i3) {

        int i9=169, i10=-9, i11=6, i12=-48748, iArr1[]=new int[N];

        FuzzerUtils.init(iArr1, -59016);

        vMeth1();
        Test.iFld1 -= (int)-14L;
        Test.iFld1 |= i3;
        Test.dFld = Test.iFld;
        for (long l : Test.lArrFld) {
            for (i9 = 4; 1 < i9; i9--) {
                Test.iFld += Test.iFld1;
                Test.dFld *= i3;
                i10 += (int)Test.instanceCount;
                Test.iFld1 -= (int)Test.fFld;
            }
        }
        Test.fFld = 98;
        for (i11 = 6; 220 > i11; i11++) {
            iArr1 = iArr1;
            Test.instanceCount = i10;
            i3 = i10;
        }
        long meth_res = by + i3 + i9 + i10 + i11 + i12 + FuzzerUtils.checkSum(iArr1);
        iMeth_check_sum += meth_res;
        return (int)meth_res;
    }

    public static void vMeth(float f, int i2) {

        byte by1=33;
        int i13=-137, i14=13, i15=-164, i16=-60804, iArr[]=new int[N], iArr2[]=new int[N];
        long l2=-1407553514556614327L;

        FuzzerUtils.init(iArr, 52624);
        FuzzerUtils.init(iArr2, -11361);

        iArr[(i2 >>> 1) % N] *= (iMeth(by1, Test.iFld) - Test.iFld);
        i13 = 1;
        do {
            f = f;
            Test.instanceCount -= Test.instanceCount;
            for (l2 = 1; l2 < 5; l2++) {
                iArr2[i13 + 1] *= (int)Test.dFld;
                Test.iFld1 *= i2;
                Test.lArrFld[(int)(l2 - 1)] = -41;
                Test.instanceCount += (l2 * l2);
                Test.iFld1 = 71;
                for (i15 = 1; i15 < 2; ++i15) {
                    i14 -= by1;
                    Test.iFld = i16;
                    i14 <<= (int)l2;
                    Test.instanceCount += (i15 * i15);
                }
            }
        } while (++i13 < 332);
        vMeth_check_sum += Float.floatToIntBits(f) + i2 + by1 + i13 + l2 + i14 + i15 + i16 + FuzzerUtils.checkSum(iArr)
            + FuzzerUtils.checkSum(iArr2);
    }

    public void mainTest(String[] strArr1) {

        int i=3, i1=-1, i17=-213, i18=0, i19=-33390, i20=-10, i21=7805, i22=-43295, i23=0, i24=229, i25=185, i26=23082,
            i27=12, i28=45117, i29=-11, iArr3[]=new int[N];
        boolean b1=true;
        short s1=-22883;
        float fArr1[][]=new float[N][N];
        double dArr[]=new double[N];

        FuzzerUtils.init(fArr1, 0.935F);
        FuzzerUtils.init(iArr3, 22468);
        FuzzerUtils.init(dArr, 1.112743);

        for (i = 259; i > 16; --i) {
            vMeth(-72.43F, i1);
            Test.fFld += (i * i);
            for (i17 = 4; i17 < 103; i17++) {
                for (i19 = 1; i19 < 2; i19++) {
                    i18 *= i;
                    i20 += (0 + (i19 * i19));
                }
                fArr1[i17 + 1][i17 + 1] = Test.instanceCount;
                for (i21 = 1; i21 < 2; ++i21) {
                    fArr1[i - 1][i21] = i21;
                    if (false) break;
                }
                Test.instanceCount += (((i17 * Test.iFld1) + i23) - Test.instanceCount);
                if (b1) break;
                if (b1) break;
            }
            for (i24 = 103; 2 < i24; i24 -= 2) {
                iArr3[i] = i19;
                Test.instanceCount >>= i1;
                Test.dFld *= i19;
                Test.instanceCount *= i18;
            }
            for (i26 = 2; i26 < 103; ++i26) {
                i25 -= Test.iFld;
                s1 = (short)Test.instanceCount;
                i25 = (int)Test.instanceCount;
                Test.iFld = -22348;
                fArr1[i26][i26 + 1] = s1;
                dArr[i26] = i27;
                for (i28 = 1; 2 > i28; ++i28) {
                    byte by2=-114;
                    Test.fFld -= 6538;
                    by2 <<= (byte)i23;
                    i25 += (int)32173L;
                }
            }
        }

        FuzzerUtils.out.println("i i1 i17 = " + i + "," + i1 + "," + i17);
        FuzzerUtils.out.println("i18 i19 i20 = " + i18 + "," + i19 + "," + i20);
        FuzzerUtils.out.println("i21 i22 i23 = " + i21 + "," + i22 + "," + i23);
        FuzzerUtils.out.println("b1 i24 i25 = " + (b1 ? 1 : 0) + "," + i24 + "," + i25);
        FuzzerUtils.out.println("i26 i27 s1 = " + i26 + "," + i27 + "," + s1);
        FuzzerUtils.out.println("i28 i29 fArr1 = " + i28 + "," + i29 + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(fArr1)));
        FuzzerUtils.out.println("iArr3 dArr = " + FuzzerUtils.checkSum(iArr3) + "," +
            Double.doubleToLongBits(FuzzerUtils.checkSum(dArr)));

        FuzzerUtils.out.println("Test.instanceCount Test.iFld Test.iFld1 = " + Test.instanceCount + "," + Test.iFld +
            "," + Test.iFld1);
        FuzzerUtils.out.println("Test.dFld Test.fFld Test.lArrFld = " + Double.doubleToLongBits(Test.dFld) + "," +
            Float.floatToIntBits(Test.fFld) + "," + FuzzerUtils.checkSum(Test.lArrFld));

        FuzzerUtils.out.println("vMeth1_check_sum: " + vMeth1_check_sum);
        FuzzerUtils.out.println("iMeth_check_sum: " + iMeth_check_sum);
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
//DEBUG  iMeth ->  iMeth vMeth mainTest
//DEBUG  vMeth1 ->  vMeth1 iMeth vMeth mainTest
//DEBUG  Depth = 3
//DEBUG  Classes = 1
//DEBUG  static objects = {}