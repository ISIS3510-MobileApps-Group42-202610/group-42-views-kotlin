# 🚀 Guía de Instalación y Setup - UniMarket

## Requisitos Previos

### Hardware
- Computadora con al menos 8GB RAM
- 10GB de espacio en disco disponible

### Software Necesario
- **Android Studio** 2023.1 o superior
  - Descargar desde: https://developer.android.com/studio
- **JDK 11** o superior
- **Gradle 8.1** o superior

## Pasos de Instalación

### 1. Preparar el Entorno Android

#### En Windows:

```powershell
# Instalar Java 11
# Opción 1: Usar Chocolatey
choco install openjdk11

# Opción 2: Descargar manualmente desde oracle.com

# Configurar variables de entorno
# JAVA_HOME -> ruta de instalación de Java
# PATH -> agregar bin de Java
```

#### En macOS:

```bash
# Usar Homebrew
brew install java11

# Configurar JAVA_HOME en ~/.zshrc
export JAVA_HOME=$(/usr/libexec/java_home -v 11)
```

### 2. Clonar el Repositorio

```bash
# HTTPS
git clone https://github.com/tu-usuario/unimarket.git

# O SSH
git clone git@github.com:tu-usuario/unimarket.git

cd kotlinviews
```

### 3. Abrir en Android Studio

1. **Abre Android Studio**
2. Click en **"File"** → **"Open"**
3. Selecciona la carpeta `kotlinviews`
4. Espera a que se sincronice Gradle (puede tomar 2-5 minutos en la primera vez)

### 4. Configurar Emulador (si no tienes dispositivo)

1. **Abre el AVD Manager:**
   - Tools → Device Manager → Create device

2. **Selecciona un dispositivo:**
   - Pixel 6 (recomendado)
   - Resolución: 2400x1080

3. **Selecciona una imagen de sistema:**
   - Android 13 o superior
   - API Level 33+

4. **Finaliza la creación**

### 5. Ejecutar la Aplicación

#### Opción A: Desde Android Studio

1. Selecciona un emulador en el dropdown superior
2. Click en **▶ Run** (o presiona Shift+F10)
3. Espera a que compile y se ejecute (primer build puede tomar 5-10 minutos)

#### Opción B: Desde Terminal

```bash
# En la raíz del proyecto

# Compilar
./gradlew build

# Instalar en emulador
./gradlew installDebug

# O ejecutar directamente
./gradlew run
```

#### Opción C: En Dispositivo Real

```bash
# Habilitar debug USB en el dispositivo
# Settings → Developer Options → USB Debugging (ON)

# Conectar dispositivo via USB
# Ejecutar desde Android Studio o:
./gradlew installDebug
```

## Solución de Problemas

### 1. Error: "Gradle sync failed"

**Solución:**
```bash
# Limpiar caché de Gradle
./gradlew clean

# Re-sincronizar
./gradlew sync
```

### 2. Error: "SDK not found"

**Solución:**
1. Abre Android Studio
2. Tools → SDK Manager
3. Descarga "Android SDK Platform" API 34

### 3. Error: "JAVA_HOME not set"

**Windows:**
```powershell
# En CMD o PowerShell
setx JAVA_HOME "C:\Program Files\Java\jdk-11"
```

**Mac/Linux:**
```bash
# En ~/.zshrc o ~/.bash_profile
export JAVA_HOME=$(/usr/libexec/java_home -v 11)
source ~/.zshrc
```

### 4. Emulador muy lento

**Soluciones:**
- Habilitar "Hardware Acceleration"
- Settings → Tools → Emulator
- Aumentar RAM asignada (Edit device → RAM 4GB o más)

### 5. Error: "Compose version mismatch"

**Solución:**
- Abre `app/build.gradle.kts`
- Verifica que la versión de Compose sea 2023.10.01

## Estructura de Carpetas Generada

```
kotlinviews/
├── .git/                          # Control de versiones
├── .idea/                         # Configuración de IDE
├── .gradle/                       # Caché de Gradle
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/unimarket/app/
│   │   │   │   ├── MainActivity.kt
│   │   │   │   ├── data/
│   │   │   │   ├── ui/
│   │   │   │   │   ├── components/
│   │   │   │   │   ├── navigation/
│   │   │   │   │   ├── screens/
│   │   │   │   │   └── theme/
│   │   │   └── res/
│   │   │       ├── values/
│   │   │       └── values-es/
│   │   ├── test/                 # Tests unitarios
│   │   └── androidTest/          # Tests de instrumentación
│   ├── build.gradle.kts
│   └── proguard-rules.pro
├── build.gradle.kts
├── settings.gradle.kts
├── gradle.properties
├── gradlew                        # Gradle Wrapper (Linux/Mac)
├── gradlew.bat                    # Gradle Wrapper (Windows)
├── README.md
├── DESIGN_SYSTEM.md
└── USAGE_GUIDE.md
```

## Comandos Útiles de Gradle

```bash
# Limpiar proyecto
./gradlew clean

# Compilar (sin instalar)
./gradlew build

# Ejecutar en emulador
./gradlew run

# Generar APK de debug
./gradlew assembleDebug

# Generar APK de release (requiere firma)
./gradlew assembleRelease

# Ejecutar tests unitarios
./gradlew test

# Ejecutar tests instrumentados
./gradlew connectedAndroidTest

# Ver dependencias
./gradlew dependencies

# Actualizar dependencias
./gradlew dependencyUpdates

# Verbose (más información)
./gradlew build --info
```

## Configuración de Emulador Recomendada

### Especificaciones Mínimas
- **CPU/ABI**: x86_64
- **RAM**: 2GB
- **Internal Storage**: 2GB
- **SD Card**: 100MB

### Especificaciones Óptimas
- **CPU/ABI**: x86_64
- **RAM**: 4GB
- **Internal Storage**: 4GB
- **SD Card**: 500MB
- **Heap Size**: 512MB
- **Device Frame**: On
- **Enable Keyboard Input**: On

## Verificación de Instalación

Después de seguir estos pasos, ejecuta:

```bash
# Verificar que todo esté correctamente instalado
./gradlew -version

# Debería mostrar:
# ----
# Gradle X.X.X
# ----
```

## Primera Ejecución

1. El primer build tomará 5-10 minutos (descarga dependencias)
2. La pantalla Splash se mostrará por 3 segundos
3. Serás llevado al Login Screen
4. Usa cualquier email/contraseña para entrar (es mock)

## Próximos Pasos

Después de ejecutar la app exitosamente:

1. ✅ Explora todas las 12 pantallas
2. ✅ Lee USAGE_GUIDE.md para detalles de cada pantalla
3. ✅ Lee DESIGN_SYSTEM.md para entender los componentes
4. ✅ Modifica MockData.kt para agregar más datos
5. ✅ Personaliza colores en Color.kt

## Desarrollo Continuo

### Hot Reload (Recomposición en Vivo)

```bash
# Con Compose, los cambios se reflejan automáticamente
# Sin necesidad de reiniciar la app

# Cambios que requieren rebuild:
# - Modificaciones en AndroidManifest.xml
# - Cambios en build.gradle
# - Nuevas dependencias
```

### Debug

1. Coloca breakpoints en el código
2. Run → Debug 'app' (Shift+F9)
3. Usa el debugger de Android Studio

## Soporte y Recursos

### Documentación
- [Android Dev Docs](https://developer.android.com/)
- [Jetpack Compose Guide](https://developer.android.com/jetpack/compose)
- [Material Design 3](https://m3.material.io/)

### Comunidades
- Stack Overflow (tag: android, kotlin)
- Reddit: r/AndroidDev
- Kotlin Slack Channel

---

**¡Listo para comenzar a desarrollar!** 🎉

Si encuentras problemas, revisa los logs en:
- Android Studio → Logcat
- Terminal → `./gradlew build --verbose`

