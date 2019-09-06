using System;
using System.Collections.Generic;

namespace Assignment1
{
    class Program
    {
        static void Main(string[] args)
        {
            List<Student> studenList = new List<Student>();
            List<MonHoc> monHocList = new List<MonHoc>();
            List<DiemThi> diemThiList = new List<DiemThi>();

            int choose;
            int chooseStudent;
            int chooseMonHoc;
            int chooseDiemThi;
            do {
                showMenu();
                choose = Int32.Parse(Console.ReadLine());

                switch (choose)
                {
                    case 1:
                        do {
                            showStudentMenu();
                            chooseStudent = Int32.Parse(Console.ReadLine());
                            switch (chooseStudent)
                            {
                                case 1:
                                    Student std = new Student();
                                    std.input();
                                    studenList.Add(std);
                                    break;
                                case 2:
                                    Console.WriteLine("Nhap ma so sinh vien muon sua : ");
                                    string msTmp = Console.ReadLine();
                                    Student stdTmp = new Student();
                                    int cout_1 = 0;
                                    for (int i = 0; i < studenList.Count; i++)
                                    {
                                        if (studenList[i].msSinhVien.Equals(msTmp))
                                        {
                                            stdTmp = studenList[i];
                                            cout_1++;
                                        }
                                    }
                                    if(cout_1 > 0)
                                    {
                                        stdTmp.input();
                                        studenList.Add(stdTmp);
                                    }
                                    else
                                    {
                                        Console.WriteLine("Sinh vien khong ton tai trong danh sach!");
                                    }
                                    break;
                                case 3:
                                    Console.WriteLine("Nhap ma so sinh vien muon xoa : ");
                                    string msTmp2 = Console.ReadLine();
                                    Student stdTmp2 = new Student();
                                    int cout_2 = 0;
                                    for (int i = 0; i < studenList.Count; i++)
                                    {
                                        if (studenList[i].msSinhVien.Equals(msTmp2))
                                        {
                                            stdTmp2 = studenList[i];
                                            cout_2++;
                                        }
                                    }
                                    if (cout_2 > 0)
                                    {
                                        studenList.Remove(stdTmp2);
                                    }
                                    else
                                    {
                                        Console.WriteLine("Sinh vien khong ton tai trong danh sach!");
                                    }
                                    break;
                                case 4:
                                    Console.WriteLine("Quay lai!");
                                    break;
                                default:
                                    Console.WriteLine("Chon lai!!!");
                                    break;
                            }
                        } while (chooseStudent != 4);
                        break;
                    case 2:
                        do
                        {
                            showMonHocMenu();
                            chooseMonHoc = Int32.Parse(Console.ReadLine());
                            switch (chooseMonHoc)
                            {
                                case 1:
                                    MonHoc monhoc = new MonHoc();
                                    monhoc.input();
                                    monHocList.Add(monhoc);
                                    break;
                                case 2:
                                    Console.WriteLine("Nhap ma mon hoc muon sua : ");
                                    string maTmp = Console.ReadLine();
                                    MonHoc monhocTmp = new MonHoc();
                                    int coutmh_1 = 0;
                                    for (int i = 0; i < monHocList.Count; i++)
                                    {
                                        if (monHocList[i].maMonHoc.Equals(maTmp))
                                        {
                                            monhocTmp = monHocList[i];
                                            coutmh_1++;
                                        }
                                    }
                                    if (coutmh_1 > 0)
                                    {
                                        monhocTmp.input();
                                        monHocList.Add(monhocTmp);
                                    }
                                    else
                                    {
                                        Console.WriteLine("Mon hoc khong ton tai trong danh sach!");
                                    }
                                    break;
                                case 3:
                                    Console.WriteLine("Nhap ma mon hoc muon xoa : ");
                                    string maTmp2 = Console.ReadLine();
                                    MonHoc monhocTmp2 = new MonHoc();
                                    int coutmh_2 = 0;
                                    for (int i = 0; i < monHocList.Count; i++)
                                    {
                                        if (monHocList[i].maMonHoc.Equals(maTmp2))
                                        {
                                            monhocTmp2 = monHocList[i];
                                            coutmh_2++;
                                        }
                                    }
                                    if (coutmh_2 > 0)
                                    {
                                        monHocList.Remove(monhocTmp2);
                                    }
                                    else
                                    {
                                        Console.WriteLine("Mon hoc khong ton tai trong danh sach!");
                                    }
                                    break;
                                case 4:
                                    Console.WriteLine("Quay lai!");
                                    break;
                                default:
                                    Console.WriteLine("Chon lai!!!");
                                    break;
                            }
                        } while (chooseMonHoc != 4);
                        break;
                    case 3:
                        do
                        {
                            showDiemThiMenu();
                            chooseDiemThi = Int32.Parse(Console.ReadLine());
                            switch (chooseDiemThi)
                            {
                                case 1:
                                    DiemThi diemthi = new DiemThi();
                                    diemthi.input();
                                    diemThiList.Add(diemthi);
                                    break;
                                case 2:
                                    Console.WriteLine("Nhap ma sinh vien muon sua diem thi : ");
                                    string mssvTmp = Console.ReadLine();
                                    Console.WriteLine("Nhap ma mon hoc muon sua diem thi : ");
                                    string maMonHocTmp = Console.ReadLine();

                                    DiemThi diemThiTmp = new DiemThi();
                                    int coutdt_1 = 0;
                                    for (int i = 0; i < diemThiList.Count; i++)
                                    {
                                        if (diemThiList[i].msSinhVien.Equals(mssvTmp) && diemThiList[i].maMonHoc.Equals(maMonHocTmp))
                                        {
                                            diemThiTmp = diemThiList[i];
                                            coutdt_1++;
                                        }
                                    }
                                    if (coutdt_1 > 0)
                                    {
                                        diemThiTmp.input();
                                        diemThiList.Add(diemThiTmp);
                                    }
                                    else
                                    {
                                        Console.WriteLine("Diem thi khong ton tai trong danh sach!");
                                    }
                                    break;
                                case 3:
                                    Console.WriteLine("Nhap ma sinh vien muon xoa diem thi : ");
                                    string mssvTmp2 = Console.ReadLine();
                                    Console.WriteLine("Nhap ma mon hoc muon sua diem thi : ");
                                    string maMonHocTmp2 = Console.ReadLine();

                                    DiemThi diemThiTmp2 = new DiemThi();
                                    int coutdt_2 = 0;
                                    for (int i = 0; i < diemThiList.Count; i++)
                                    {
                                        if (diemThiList[i].msSinhVien.Equals(mssvTmp2) && diemThiList[i].maMonHoc.Equals(maMonHocTmp2))
                                        {
                                            diemThiTmp2 = diemThiList[i];
                                            coutdt_2++;
                                        }
                                    }
                                    if (coutdt_2 > 0)
                                    {
                                        diemThiList.Remove(diemThiTmp2);
                                    }
                                    break;
                                case 4:
                                    Console.WriteLine("Quay lai!");
                                    break;
                                default:
                                    Console.WriteLine("Chon lai!!!");
                                    break;
                            }
                        } while (chooseDiemThi != 4);
                        break;
                    case 4:
                        Console.WriteLine("Exit Program!");
                        break;
                    default:
                        Console.WriteLine("Chon lai!!!");
                        break;
                }
            } while (choose != 4);
        }

        static void showMenu()
        {
            Console.WriteLine("1. Them sua xoa sinh vien");
            Console.WriteLine("2. Them sua xoa mon hoc");
            Console.WriteLine("3. Them sua xoa diem thi sinh vien");
            Console.WriteLine("4. Thoat!");
            Console.WriteLine("Choose : ");
        }

        static void showStudentMenu()
        {
            Console.WriteLine("1. Them sinh vien");
            Console.WriteLine("2. Sua sinh vien");
            Console.WriteLine("3. Xoa sinh vien");
            Console.WriteLine("4. Thoat!");
            Console.WriteLine("Choose : ");
        }

        static void showMonHocMenu()
        {
            Console.WriteLine("1. Them mon hoc");
            Console.WriteLine("2. Sua mon hoc");
            Console.WriteLine("3. Xoa mon hoc");
            Console.WriteLine("4. Thoat!");
            Console.WriteLine("Choose : ");
        }

        static void showDiemThiMenu()
        {
            Console.WriteLine("1. Them diem thi");
            Console.WriteLine("2. Sua diem thi");
            Console.WriteLine("3. Xoa diem thi");
            Console.WriteLine("4. Thoat!");
            Console.WriteLine("Choose : ");
        }
    }
}
