Sure! Here's a complete **`README.md`** you can directly copy and paste:

```markdown
# Java Learning Project – Quick Guide

```

Write Java File
│
▼
javac <File>.java
│
▼
bin/<File>.class
│
▼
java <File>
│
▼
Terminal Output

```

---

## Folder Structure

```

Java\_learning/
├── Folder1/
│   ├── 1ABC/
│   │   └── Hello1.java
│   └── 2ABC/
├── Folder2/
│   ├── 1ABC/
│   └── 2ABC/
├── FolderC/
├── bin/
│   └── runjava.sh
└── README.md

```

- **Folders (Folder1, Folder2…):** Your Java exercises.
- **Subfolders (1ABC, 2ABC…):** Contain `.java` files for each exercise.
- **bin:** Stores all compiled `.class` files centrally.
- **runjava.sh:** Script to compile and run Java files automatically.

---

## Step-by-Step Guide

### 1. Write Your Java File
Place your `.java` file in the appropriate subfolder, e.g.:
```

\~/Java\_learning/Folder1/1ABC/Hello1.java

````

### 2. Compile Your Java File
From **any folder**, run:
```bash
javac Hello1.java
````

* The file will be **compiled and stored in `bin`**.
* Example output:

```
Compiled: /home/ayush/Java_learning/Folder1/1ABC/Hello1.java → /home/ayush/Java_learning/bin
```

### 3. Run Your Java Class

From **any folder**, run:

```bash
java Hello1
```

* Example output:

```
Hello from Hello1!
```

---

## Notes

* You can run any Java file from **any subfolder** as long as it exists in the project.
* All compiled `.class` files are centralized in the **bin** folder, keeping your project directories clean.
* Make sure `runjava.sh` is **executable**:

```bash
chmod +x ~/Java_learning/bin/runjava.sh
```

* Use the commands **from any subfolder**:

```bash
javac <FileName>.java
java <ClassName>
```

```

