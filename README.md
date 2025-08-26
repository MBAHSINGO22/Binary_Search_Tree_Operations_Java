# 📝 Binary Search Tree Operations Java

Implementasi Binary Search Tree dengan Operasi Penambahan dan Penghapusan di Java

Proyek Java yang menunjukkan struktur data Binary Search Tree dengan operasi penambahan, penghapusan, dan traversal.

## 📖 Deskripsi Proyek

**Binary_Search_Tree_Operations_Java** adalah proyek pembelajaran Java yang mengimplementasikan Binary Search Tree (BST) dengan fungsi penambahan dan penghapusan node. Proyek ini berfokus pada:

- **📊 TreeNode.java**: Kelas dasar untuk node pohon dengan data integer, left node, dan right node, serta metode `isLeaf` untuk memeriksa daun.
- **🔍 Tree.java**: Kelas utama untuk mengelola BST dengan metode `add` untuk penambahan, `remove` untuk penghapusan, `getNode` dan `getParent` untuk pencarian, serta traversal (preorder, inorder, postorder).
- **🛠️ MainTree.java**: Kelas utama untuk menguji BST dengan menambahkan elemen (7, 5, 1, 10, 3, 6) dan menghapus node tertentu (10 dan 7).

Proyek ini terdiri dari tiga file Java (`MainTree.java`, `Tree.java`, `TreeNode.java`) dalam paket **PERTEMUAN5**.🟢

## 🧠 Teknologi

- Java

## 📂 Struktur File

```
Binary_Search_Tree_Operations_Java/
├── src/PERTEMUAN5/
├── MainTree.java            # 🛠️ Kelas utama untuk pengujian
├── Tree.java                # 🔍 Kelas untuk BST dan operasi
├── TreeNode.java            # 📊 Kelas node pohon
```

## 🟢 Catatan
- BST diinisialisasi kosong dan elemen ditambahkan secara berurutan (7, 5, 1, 10, 3, 6).
- Metode `remove` saat ini hanya menangani kasus sederhana (leaf, satu child); kasus dengan dua child belum diimplementasikan.
- Traversal hanya menampilkan preorder dalam contoh ini.

## 📈 Contoh Output

**MainTree.java**  
```
Preorder:
7 5 1 3 6 10 

Menghapus 10:
7 5 1 3 6 

Menghapus 7:
5 1 3 6 
```

## 👨‍💻 Pengembang

MBAHSINGO22  
🔗[ GitHub](https://github.com/MBAHSINGO22)
