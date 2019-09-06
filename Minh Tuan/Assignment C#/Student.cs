using System;
using System.Collections.Generic;
using System.Text;

namespace Assignment1
{
    class Student
    {
        public string tenSinhVien { get; set; }
        public string msSinhVien { get; set; }

        public Student() { }

        public Student(string ten, string ms)
        {
            this.tenSinhVien = ten;
            this.msSinhVien = ms;
        }

        public void input()
        {
            Console.WriteLine("Nhap ten sinh vien : ");
            this.tenSinhVien = Console.ReadLine();

            Console.WriteLine("Nhap ma so sinh vien : ");
            this.msSinhVien = Console.ReadLine();
        }

        public void display()
        {
            Console.WriteLine("Ten sv: {0} -> Ma so sv: {1}", tenSinhVien, msSinhVien);
        }
    }
}