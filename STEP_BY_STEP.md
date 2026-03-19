# 📱 INSTRUCCIONES PASO A PASO - EJECUTAR UNIMARKET

## 🎯 ANTES DE EMPEZAR

✅ Asegúrate de tener:
- Android Studio instalado
- Internet activa (para descargar dependencias)
- 20-30 minutos para la primera ejecución

---

## 📋 PASO 1: ABRIR ANDROID STUDIO

### Visual Step-by-Step:

1. **Abre Android Studio** desde el escritorio o menú de inicio
   
   ```
   [Espera 30 segundos a que cargue]
   ```

2. **Verás la pantalla inicial de Android Studio**
   
   ```
   ┌─────────────────────────────────┐
   │  Welcome to Android Studio      │
   │                                 │
   │  [New Project]                  │
   │  [Open]        ← Click aquí     │
   │  [Open Recent]                  │
   └─────────────────────────────────┘
   ```

3. **Click en "Open"**
   
   ```
   Se abre un explorador de carpetas
   ```

4. **Navega a la carpeta del proyecto**

   Copia y pega esta ruta en la barra de direcciones:
   
   ```
   C:\Users\Acer\OneDrive - Universidad de los andes\Septimo Semestre\Móvil\kotlinviews
   ```

5. **Selecciona la carpeta "kotlinviews"**
   
   ```
   ┌─────────────────────────────────┐
   │ 📁 kotlinviews   ← Selecciona   │
   │    ├── app/                     │
   │    ├── build/                   │
   │    ├── .gradle/                 │
   │    └── ...                      │
   └─────────────────────────────────┘
   ```

6. **Click en "Open"**
   
   ```
   Android Studio abre el proyecto
   [Espera 2-5 minutos mientras sincroniza Gradle]
   ```

7. **¿Cómo sabes que terminó?**
   
   Mira la esquina inferior derecha. Cuando veas:
   
   ```
   ✅ "Gradle Build Finished"
   ```
   
   ¡Ya está listo!

---

## 📱 PASO 2: CREAR O SELECCIONAR EMULADOR

### Opción A: Crear un nuevo emulador

1. **Abre Device Manager**
   
   En la barra lateral derecha de Android Studio, busca un icono de teléfono.
   Click en él para abrir Device Manager.
   
   ```
   O ve a: Tools → Device Manager
   ```

2. **Click en "Create device"**
   
   ```
   ┌─────────────────────────────────┐
   │  Device Manager                 │
   │                                 │
   │  [Create device] ← Click        │
   │                                 │
   │  Available devices:             │
   │  (ninguno aún)                  │
   └─────────────────────────────────┘
   ```

3. **Selecciona "Pixel 6"** (recomendado)
   
   ```
   ┌─────────────────────────────────┐
   │  Select a device definition     │
   │                                 │
   │  Recommended:                   │
   │  ☑ Pixel 6        ← Selecciona │
   │  ☐ Pixel 6 Pro                  │
   │  ☐ Pixel 5                      │
   │  ...                            │
   │                                 │
   │  [Cancel] [Next]                │
   └─────────────────────────────────┘
   ```

4. **Click en "Next"**

5. **Selecciona "Android 13"** o superior
   
   ```
   ┌─────────────────────────────────┐
   │  Select a system image          │
   │                                 │
   │  ☑ Android 13 (API 33)          │
   │  ☐ Android 14 (API 34)          │
   │                                 │
   │  [Cancel] [Next]                │
   └─────────────────────────────────┘
   ```

6. **Click en "Next"**

7. **Verifica los detalles**
   
   ```
   ┌─────────────────────────────────┐
   │  Android Virtual Device         │
   │                                 │
   │  AVD Name: Pixel_6_API_33       │
   │  Device: Pixel 6                │
   │  System Image: Android 13       │
   │  RAM: 2048 MB                   │
   │                                 │
   │  [Cancel] [Finish]              │
   └─────────────────────────────────┘
   ```

8. **Click en "Finish"**
   
   ```
   [Espera 5-10 minutos descargando Android]
   ```

### Opción B: Usar un emulador existente

Si ya tienes un emulador creado, simplemente verás:

```
┌─────────────────────────────────┐
│  Device Manager                 │
│                                 │
│  ▶ Pixel_6_API_33              │
│    Pixel 6 | Android 13         │
│                                 │
│  [Create device]                │
└─────────────────────────────────┘
```

Listo, ve al siguiente paso.

---

## ▶️ PASO 3: INICIAR EL EMULADOR

1. **En Device Manager, busca el botón ▶ (play)**
   
   ```
   ┌─────────────────────────────────┐
   │  Device Manager                 │
   │                                 │
   │  ▶ Pixel_6_API_33              │
   │    Pixel 6 | Android 13         │
   │                                 │
   └─────────────────────────────────┘
      ↑ Click aquí (botón ▶)
   ```

2. **El emulador se abre en una ventana nueva**
   
   ```
   ┌─────────────────────────┐
   │     EMULADOR            │
   │                         │
   │     [Android boot]      │
   │     [Cargando...]       │
   │                         │
   └─────────────────────────┘
   
   [Espera 1-2 minutos a que arranque]
   ```

3. **Cuando aparezca la pantalla de Android, está listo**

---

## 🚀 PASO 4: EJECUTAR LA APLICACIÓN

1. **En Android Studio, busca el botón ▶ Run (verde)**
   
   En la barra superior, verás:
   
   ```
   ┌──────────────────────────────────┐
   │ ▶ Run     ⏸ Pause    🔧 Tools   │
   └──────────────────────────────────┘
     ↑ Click aquí
   ```

2. **O presiona Shift + F10**

3. **Se abre un diálogo para seleccionar dispositivo**
   
   ```
   ┌────────────────────────────────┐
   │ Select Deployment Target       │
   │                                │
   │ Available devices:             │
   │                                │
   │ ☑ Pixel_6_API_33              │
   │                                │
   │ [Cancel] [OK]                  │
   └────────────────────────────────┘
   ```

4. **Verifica que tu emulador esté seleccionado**

5. **Click en "OK"**
   
   ```
   [La app comienza a compilar...]
   [Espera 5-10 minutos la primera vez]
   ```

6. **En la parte inferior de Android Studio, verás el progreso**
   
   ```
   ┌────────────────────────────────┐
   │ Logcat                         │
   │                                │
   │ Build gradle...                │
   │ Compiling resources...         │
   │ Installing APK...              │
   │ Installing app...              │
   │                                │
   │ Build completed successfully   │
   └────────────────────────────────┘
   ```

---

## ✅ PASO 5: ¡ÉXITO!

Cuando veas el emulador con la app abierta:

```
┌──────────────────────────┐
│      EMULADOR            │
│                          │
│         🏪               │
│                          │
│      UniMarket           │
│                          │
│  Student Marketplace     │
│                          │
│   (3 segundos)           │
└──────────────────────────┘
```

**¡Felicidades! La app está funcionando.**

Espera 3 segundos y te llevará automáticamente a la pantalla de Login.

---

## 🎮 PASO 6: USAR LA APP

### Login

```
┌──────────────────────────┐
│   Welcome Back           │
│                          │
│ [✉️ Email............]   │
│ [🔒 Password........]    │
│                          │
│ [Forgot Password?]       │
│                          │
│ [Log In] [Register]      │
└──────────────────────────┘
```

**Ingresa:**
- Email: cualquiera (ej: test@university.edu)
- Password: cualquiera (ej: 123456)

**Click "Log In"**

### Home Marketplace

```
┌──────────────────────────┐
│ 👋 Hello Alexandra       │
│ 🔍 Search books, notes   │
│ [All] [Books] [Elect]... │
│                          │
│ 📚 Calculus      $45 ❤   │
│ 🧮 Calculator   $120 ❤   │
│ 📝 Notes Bio     $15 ❤   │
│                          │
│ [🏠][🛍️][➕][❤️][👤]    │
└──────────────────────────┘
```

**Interacciones disponibles:**
- Click en producto → Ver detalles
- Click en ❤️ → Agregar a favoritos
- Tabs abajo → Cambiar secciones

---

## 🆘 PROBLEMAS COMUNES

### ❌ Problema: "Gradle Build Failed"

**Solución:**
1. Cierra Android Studio
2. Abre PowerShell en la carpeta del proyecto:
   ```powershell
   cd "C:\Users\Acer\OneDrive - Universidad de los andes\Septimo Semestre\Móvil\kotlinviews"
   ```
3. Ejecuta:
   ```powershell
   .\gradlew clean
   .\gradlew sync
   ```
4. Abre Android Studio de nuevo

### ❌ Problema: "Device Offline"

**Solución:**
1. Cierra el emulador
2. En Device Manager, click los 3 puntitos
3. Selecciona "Wipe Data"
4. Vuelve a abrir el emulador

### ❌ Problema: "Emulador muy lento"

**Solución:**
1. En Device Manager, click los 3 puntitos
2. Click "Edit Device"
3. Cambia RAM Memory a 4GB
4. Guarda y reinicia

---

## ⏱️ RESUMEN DE TIEMPOS

```
Paso 1: Abrir Android Studio      → 2-5 min
Paso 2: Crear emulador            → 5-10 min
Paso 3: Iniciar emulador          → 1-2 min
Paso 4: Ejecutar app (1ª vez)     → 5-10 min
─────────────────────────────────
TOTAL                             → 20-30 min

Siguientes ejecuciones:           → 2-5 min
```

---

## 📖 ¿NECESITAS MÁS AYUDA?

Lee estos archivos en la carpeta del proyecto:

- **QUICK_START.md** - Guía rápida
- **README.md** - Descripción general
- **USAGE_GUIDE.md** - Cómo usar cada pantalla
- **INSTALLATION.md** - Troubleshooting avanzado

---

**¡Ya estás listo para disfrutar UniMarket!** 🚀

Explora todas las 12 pantallas, interactúa con los elementos, y diviértete con el diseño neumórfico.

¿Preguntas? Revisa la documentación o busca online el error específico que tengas.

