# Question 1
Pertanyaan nomor 1 adalah "membuang pixel yang kurang colorful yang ditandai dengan teks kuning.".

Asumsi warna yang kurang colorful adalah jika memiliki range warna di bawah 38 atau batas bawah warna Blue di bawah 51.

Untuk melakukan testing, run file QuestionOne.kt dan check resultnya dalam format berikut :

======================================
==============RESULT==============

Accepted Color

[34, 203, 55]
, [144, 89, 54]
, [171, 180, 211]
, [150, 150, 90]
, [50, 150, 150]
, [209, 109, 107]
, [111, 117, 212]
, [214, 113, 165]
, [45, 137, 212]
, [182, 240, 245]
, [199, 184, 72]
, [204, 75, 193]
, [170, 209, 167]
, [1, 90, 20]
, [174, 214, 174]
, [196, 106, 112]

======================================
======================================
Rejected Color

[67, 76, 73]
, [99, 105, 93]
, [178, 173, 169]
, [22, 20, 18]
, [10, 40, 50]
, [140, 132, 139]
, [87, 76, 63]
, [173, 166, 167]
, [48, 35, 46] 

# Question 2

Pertanyaan nomor 2 "apakah gambar di bawah ini merupakan gambar yang colorful atau gambar yang lebih mirip dengan hitam-putih".

Asumsi warna yang kurang colorful adalah jika memiliki range warna di bawah 38 atau batas bawah warna Blue di bawah 51.
Kemudian dilakukan komparasi kelompok colorful dan hitam-putih, mana yang persentasenya lebih besar, setelah itu akan ditarik konklusi seperti contoh result di bawah ini.

Untuk melakukan testing, run file QuestionTwo.kt dan check resultnya dalam format berikut :

==============================
======RESULT===========
==============================
black n white, percentage 100 %
