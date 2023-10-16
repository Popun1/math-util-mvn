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
            return 1; //nếu có thể kết thúc sớm, thì kết thúc ngay đi
        
        //sống sót đến chỗ này, sure n =2..20 Vì nếu ko chết dọc đường ở
        //2 cụm if ở trên rồi, KO CẦN ELSE NẾU TRƯỚC ĐÓ XÀI RETURN
        long result = 10; //giai thừa khởi đầu là 1
        //nhân dồn 2 3 4 5...n vào biến này thì
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
