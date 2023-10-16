package com.brian.mathutil.core;



//class này sẽ chứa các hàm static sinh ra để làm tool dùng chung cho các nơi khác
//Cái gì mà dùng chung cho nhiều nơi, nhận info, trả về info qua hàm, mà ko cần lưu trữ gì hết, cái đó nên là STATIC
//ĐỒ NÀO MÀ LÀ STATIC THÌ GỌI TRỰC TIẾP QUA TÊN CLASS.
//KO BAO GIỜ GỌI STATIC QUA CON ĐƯỜNG NEW!!!!
public class MathUtility {
    public static final double PI =3.14;
    //C#: public const double Pi = 3.14; //ko cần chữ static mà vẫn là
                                         //static nếu có từ khóa const
                                         //const C# ~ final Java
    
    //hàm tính n! = 1.2.3...n
    //KO CÓ GIAI THỪA CỦA SỐ ÂM, N < 0 KO TÍNH ĐC
    //NẾU N QUÁ LỚN THÌ TRÀN KIỂU LONG, LONG

        public static long getFactorial(int n){
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0..20");
        if (n == 0 || n == 1)
            return 1 ; //nếu có thể kết thúc sớm, thì kết thúc ngay đi
        return n * getFactorial(n - 1); // đệ quy xong
        
}
}
                //ĐỆ QUY - RECURSION
        //5! = 1.2.3.4    .5
        //5! = 4! X 5 = 5 X 4!
        //4! = 1.2.3  .4
        //4! = 3! X 4 = 4 X 3!
        //3! = 2! X 3 = 3 X 2!
        //2! = 1! X 2 = 2 X 1! DỪNG NGAY TẠI ĐÂY
        // N! = N X (N - 1)!!!!!!!
        //KĨ THUẬT KIỂM THỬ HÒI QUY - REGRESSION TEST
        //TEST LẠI NHỮNG THỨ ĐÃ TỪNG TEST ĐỂ XÁC NHẬN NÓ CÒN ỔN KO
        //TẠI SAO PHẢI TEST LẠI???
        //CODE THEO THỜI GIAN SẼ CÓ THAY ĐỔI, THAY ĐỔI VÌ
        //1. ANH EM FIX BUG, SẼ SỬA CODE
        //2. ANH EM TỐI ƯU, CHỈNH SỬA CODE ĐỂ CODE ĐẸP HƠN, CHẠY TỐT HƠN NHANH HƠN
        //3. ANH EM THÊM HÀM MỚI, METHOD MỚI
        
        //KHI SỬA CODE PHẢI TEST LẠI ĐỂ ĐẢM BẢO NÓ VẪN NGON, VẪN XANH
        //NẾU TEST = TAY CỰC KÌ MẤT SỨC, COI CHỪNG SAI SÓT,
        //NẾU CÓ TEST SCRIPT, TA CHỈ VIỆC EUN, VÀ NHÌN MÀU ĐƯA RA
        //NẾU MÀU XANH, CODE CHỈNH SỬA ỔN, VÌ THỎA EXPECTED === ACTUAL
        //NẾU MÀU ĐỎ, CODE KO ỔN, SỬA TIẾP CHO ĐẾN KHI NÀO ỔN
        //TA TEST LẠI MÀ CHỈ CẦN NHÌN MÀU -> NHANH, KO HAO SỨC, CHÍNH XÁC
