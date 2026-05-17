# PBO Pertemuan 9 - Polimorfisme & Method Overloading

## Cara Menjalankan

### 1. Compile semua file Java

```bash
# Compile file di root
javac DemoMain.java Test.java Sum.java

# Compile file di folder Polimorfisme
javac Polimorfisme/*.java
```

### 2. Jalankan program

#### Method Overloading
```bash
java DemoMain
java Test
java Sum
```

#### Polymorphism (Program Interaktif)
```bash
java -cp . Polimorfisme.App
```
Program ini akan meminta input dari user untuk menghitung luas:
- **Persegi panjang** → masukkan panjang dan lebar
- **Segitiga siku-siku** → masukkan alas dan tinggi
- **Persegi** → masukkan sisi
- **Lingkaran** → masukkan jari-jari

### Compile & Run Semua Sekaligus (Opsional)
```bash
javac DemoMain.java Test.java Sum.java Polimorfisme/*.java
```
```bash
java DemoMain; java Test; java Sum; java -cp . Polimorfisme.App
```
