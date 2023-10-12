/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.brian.mathutil.main;

import com.brian.mathutil.core.MathUtility;

/**
 *
 * @author Popun
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 0; //hàm ý kiểm tra 0 giai thừa
        long expected = 1; //hàm ý rằng, hy vọng n = 0! phải trả về 1
        long actual = MathUtility.getFactorial(n); //thực tế là mấy. gọi hàm là biết ngay
        System.out.println(n + "! -> expected: " + expected + "| actual: " + actual);
        
        n = 5;
        expected = 120;
        actual = MathUtility.getFactorial(n);
        System.out.println(n + "! -> expected: " + expected + "| actual: " +actual);
    }
    
}

//DÂN DEV VIẾT CODE: HÀM, CLASS ĐỒNG THỜI PHẢI CÓ TRÁCH NHIỆM
//TEST CODE CỦA HẮN LÀM SAO
//LÀM THẾ NÀO TEST CODE CỦA CHÍNH MÌNH
//CÓ 3 CÁCH
//CÁCH 1: IN RA MÀN HÌNH KẾT QUẢ XỬ LÍ CỦA HÀM

//CÁCH 2: IN RA LOG FILE

//CÁCH 3: DÙNG ĐỒ CHƠI BÊN NGOÀI ĐEM VÀO - THƯ VIỆN ĐEM VÀO!!!!!

//NHƯNG DÙ LÀ KIỂM THỬ KIỂU GÌ, THÌ CŨNG GỒM 3 CÔNG VIỆC
//THIẾT KẾ TEST CASE
//THỰC THI TEST CASE - TEST RUN
//GHI BUG NẾU CÓ = LOG BUG

//TEST CASE LÀ: BỘ DATA ĐƯA VÀO APP ĐẺ XEM APP HÀNH XỬ ĐÚNG HEM
//              KÈM THÊM EXPECTED VALUE ĐỂ XEM APP TRẢ VỀ GIỐNG HEM
//              KÈM THÊM HƯỚNG DẪN SỬ DỤNG APP VỚI DATA ĐƯA VÀO
//              KÈM THÊM TRẠNG THÁI CỦA TEST CASE: APP ĐÚNG HAY SAI

//CẤU TRỨC CỦA 1 TEST CASE NHƯ SAU
//(DÙNG TRONG THỰC TẾ ĐI LÀM, VÀ DÙNG TRONG BÀI THI PE)

//MỘT TEST CASE BAO GỒM NHỮNG INFO SAU:
//TEST CASE ID | TEST CASE DESCRIPTION | STEPS/PROCEDURES
//EXPECTED RESULT | STATUS (PASSED | FAILED)

//Test case là tình huống xài app với bộ data đưa vào và giá trị kì
//vọng app phải trả về
//Giờ ta mún test hàm getF() ta phải thiết kế các test case coi xem
//hàm trả về đúng ko

//TEST CASE #1: VERIFY getFactorial(with n = 0) check 0! correct or not?
//TEST STEPS/PROCEDURES
//          1. Given n = 0
//          2. Call/invoke getFactorial(n = 0)

//EXPECTED RESULT:
//          the method must return 1 as the result of 0!

//STATUS: PASSED | FAILED, jusst waiting the method returns value
//                          ĐOÁN XEM!!!

//CÂU 3 BÀI THI PE VIẾT RA KHOẢNG 10 CÁI TEST CASE NHƯ TRÊN

//TEST CASE #2: VERIFY getFactorial(with n = 5) check 5! correct or not?
//TEST STEPS/PROCEDURES
//          1. Given n = 5
//          2. Call/invoke getFactorial(n = 5)

//EXPECTED RESULT:
//          the method must return 120 as the result of 5!

//STATUS: PASSED | FAILED, jusst waiting the method returns value
//                          ĐOÁN XEM!!!