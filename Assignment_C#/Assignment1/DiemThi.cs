using System;
using System.Collections.Generic;
using System.Text;

namespace Assignment1
{
    class DiemThi
    {
        public float diem { get; set; }
        public string msSinhVien { get; set; }
        public string maMonHoc { get; set; }

        public DiemThi() { }

        public DiemThi(float diem, string mssv, string monhoc)
        {
            this.diem = diem;
            this.msSinhVien = mssv;
            this.maMonHoc = monhoc;
        }

        public void input()
        {
            Console.WriteLine("Nhap diem thi sinh vien : ");
            this.diem = float.Parse(Console.ReadLine());

            Console.WriteLine("Nhap ma so sinh vien : ");
            this.msSinhVien = Console.ReadLine();

            Console.WriteLine("Nhap ma mon hoc : ");
            this.maMonHoc = Console.ReadLine();
        }

        public void display()
        {
            Console.WriteLine("Ma so sv: {0} -> Ma mon hoc: {1} -> Diem thi: {2}", msSinhVien, maMonHoc, diem);
        }
    }
}
