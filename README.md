# 📸 CameraApp

<p align="center">
  <img src="https://img.shields.io/badge/Platform-Android-3DDC84?style=for-the-badge&logo=android&logoColor=white" />
  <img src="https://img.shields.io/badge/Language-Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/IDE-Android%20Studio-3DDC84?style=for-the-badge&logo=android-studio&logoColor=white" />
  <img src="https://img.shields.io/badge/Build-Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white" />
  <img src="https://img.shields.io/badge/License-MIT-blue?style=for-the-badge" />
</p>

<p align="center">
  A native Android camera application built in Java using Android Studio, enabling users to capture photos directly from their device camera with a clean and intuitive interface.
</p>

---

## 📋 Table of Contents

- [Overview](#-overview)
- [Features](#-features)
- [Tech Stack](#-tech-stack)
- [Prerequisites](#-prerequisites)
- [Getting Started](#-getting-started)
- [Project Structure](#-project-structure)
- [Permissions](#-permissions)
- [Build & Run](#-build--run)
- [Contributing](#-contributing)
- [License](#-license)

---

## 🔍 Overview

**CameraApp** is a lightweight Android application that demonstrates how to integrate camera functionality using Android's native APIs in Java. Designed as a clean, practical example, it covers the full lifecycle of opening the camera, capturing images, and handling the results within an Android Activity — making it an ideal reference for developers learning Android camera development.

---

## ✨ Features

- 📷 **Photo Capture** — Launch the device camera and capture images seamlessly
- 🔄 **Camera Intent Integration** — Uses Android's built-in camera intent for broad device compatibility
- 🖼️ **Image Preview** — Display captured photos within the app after taking them
- 🔐 **Runtime Permissions** — Handles camera permission requests following Android best practices
- 📱 **Clean UI** — Minimal, user-friendly interface focused on core camera functionality

---

## 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| **Java** | Primary programming language |
| **Android SDK** | Core Android APIs and UI components |
| **Android Studio** | IDE and development environment |
| **Gradle (Kotlin DSL)** | Build system and dependency management |
| **Android Camera API** | Device camera access and control |

---

## ✅ Prerequisites

Before getting started, ensure you have the following installed:

- **Android Studio** Hedgehog (2023.1.1) or newer
- **Java Development Kit (JDK)** 8 or higher
- **Android SDK** with API level 21 (Android 5.0 Lollipop) or higher
- A physical Android device **or** an Android Virtual Device (AVD) with camera support

---

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/arjunrhetoric/CameraApp.git
cd CameraApp
```

### 2. Open in Android Studio

1. Launch **Android Studio**
2. Select **File → Open**
3. Navigate to the cloned `CameraApp` directory and click **OK**
4. Wait for Gradle to sync all project dependencies

### 3. Connect a Device or Start an Emulator

- **Physical device:** Enable Developer Options and USB Debugging, then connect via USB
- **Emulator:** Open the AVD Manager in Android Studio and start a virtual device with camera support enabled

### 4. Run the App

Click the **▶ Run** button in Android Studio, or use the keyboard shortcut:

```
Shift + F10  (Windows/Linux)
Control + R  (macOS)
```

---

## 📁 Project Structure

```
CameraApp/
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/com/example/cameraapp/
│   │       │   └── MainActivity.java       # Main activity with camera logic
│   │       ├── res/
│   │       │   ├── layout/
│   │       │   │   └── activity_main.xml   # Main UI layout
│   │       │   ├── drawable/               # App icons and graphics
│   │       │   └── values/                 # Strings, colors, themes
│   │       └── AndroidManifest.xml         # App configuration and permissions
│   └── build.gradle.kts                    # App-level build configuration
├── gradle/
│   └── wrapper/
│       └── gradle-wrapper.properties       # Gradle wrapper configuration
├── build.gradle.kts                        # Project-level build configuration
├── settings.gradle.kts                     # Project settings
├── gradle.properties                       # Gradle properties
└── README.md
```

---

## 🔐 Permissions

This application requires the following permissions, declared in `AndroidManifest.xml`:

```xml
<uses-permission android:name="android.permission.CAMERA" />
<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />

<uses-feature android:name="android.hardware.camera" android:required="true" />
```

> **Note:** On Android 6.0 (API 23) and above, the app requests camera permission at runtime the first time the user attempts to take a photo.

---

## 🔧 Build & Run

### Debug Build

```bash
./gradlew assembleDebug
```

### Release Build

```bash
./gradlew assembleRelease
```

### Run Tests

```bash
./gradlew test
```

The generated APK can be found at:
```
app/build/outputs/apk/debug/app-debug.apk
```

---

## 🤝 Contributing

Contributions are welcome! To get started:

1. **Fork** the repository
2. **Create** a new branch for your feature or fix:
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. **Commit** your changes with a descriptive message:
   ```bash
   git commit -m "feat: add front camera toggle support"
   ```
4. **Push** to your fork:
   ```bash
   git push origin feature/your-feature-name
   ```
5. **Open a Pull Request** against the `master` branch

Please ensure your code follows standard Java conventions and is well-commented.

---

## 📄 License

This project is licensed under the **MIT License** — see the [LICENSE](LICENSE) file for details.

```
MIT License

Copyright (c) 2024 arjunrhetoric

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software.
```

---

<p align="center">
  Made with ❤️ by <a href="https://github.com/arjunrhetoric">arjunrhetoric</a>
</p>
