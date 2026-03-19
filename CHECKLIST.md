# ✅ CHECKLIST VISUAL - EJECUTAR UNIMARKET

## 📋 CHECKLIST PASO A PASO

Marca cada paso conforme lo completes:

### PASO 1: DESCARGAR E INSTALAR ANDROID STUDIO
```
☐ Abre: https://developer.android.com/studio
☐ Descarga Android Studio
☐ Instala (siguiente, siguiente, finalizar)
☐ Abre Android Studio
```

### PASO 2: ABRIR EL PROYECTO
```
☐ Android Studio → File → Open
☐ Navega a: 
   C:\Users\Acer\OneDrive - Universidad de los andes\
   Septimo Semestre\Móvil\kotlinviews
☐ Selecciona la carpeta "kotlinviews"
☐ Click "Open"
☐ ESPERA 2-5 MINUTOS (Gradle sync)
☐ Verifica: Sin errores rojos en la consola
```

### PASO 3: CREAR EMULADOR (o saltar si tienes celular)
```
☐ En Android Studio, lado derecho: busca icono 📱
☐ Click en "Device Manager"
☐ Click en "Create device"
☐ Selecciona: Pixel 6
☐ Click "Next"
☐ Selecciona: Android 13 (o superior)
☐ Click "Next" → "Finish"
☐ ESPERA 10 MINUTOS (descarga Android OS)
☐ Verifica: El emulador aparece en la lista
```

### PASO 4: INICIAR EMULADOR
```
☐ En Device Manager, busca tu emulador
☐ Click en el botón ▶ (play)
☐ ESPERA 2 MINUTOS (emulador arranca)
☐ Verifica: Ves pantalla del emulador (verde o negra)
```

### PASO 5: EJECUTAR LA APP
```
☐ Arriba en Android Studio: busca botón ▶ (verde)
☐ Click en el botón "Run" (o Shift + F10)
☐ Selecciona tu emulador en la lista
☐ Click "OK"
☐ ESPERA 5-10 MINUTOS (compila)
☐ Verifica: Ves el Splash Screen 🏪 en el emulador
```

### PASO 6: USA LA APP
```
☐ Espera 3 segundos (Splash auto-navega)
☐ Verás Login Screen
☐ Escribe cualquier email (ej: test@university.edu)
☐ Escribe cualquier contraseña (ej: 123456)
☐ Click "Log In"
☐ Verás Home con 6 productos
☐ ¡ÉXITO! 🎉
```

---

## 🎯 SEÑALES DE QUE TODO ESTÁ BIEN

### ✅ Gradle Sync
```
Abajo de Android Studio verás:
"Gradle build finished in 2m 34s"
(sin errores rojos)
```

### ✅ Emulador Arrancó
```
Verás en Device Manager:
Mi emulador: [Pixel 6 - Android 13] ✓
(con estado online/verde)
```

### ✅ App Compiló
```
En la consola Logcat verás:
"Build successful in X seconds"
La app abre automáticamente en el emulador
```

### ✅ App Ejecutándose
```
Ves en el emulador:
┌─────────────────────┐
│       🏪            │
│    UniMarket        │
│  Student Mpkt       │
└─────────────────────┘
```

---

## ❌ SEÑALES DE PROBLEMAS (y soluciones)

### ❌ Ves errores rojos en Gradle
```
SOLUCIÓN:
☐ Abre PowerShell en la carpeta del proyecto
☐ Corre: .\gradlew clean
☐ Corre: .\gradlew sync
☐ Espera a que termine
```

### ❌ Emulador no arranca
```
SOLUCIÓN:
☐ Device Manager → Click los 3 puntitos
☐ Selecciona: "Cold Boot Now"
☐ Espera 2-3 minutos
```

### ❌ App compila pero se queda en blanco
```
SOLUCIÓN:
☐ Device Manager → los 3 puntitos
☐ "Wipe Data"
☐ Ejecuta nuevamente
```

### ❌ Mensaje: "SDK not found"
```
SOLUCIÓN:
☐ Android Studio → Tools → SDK Manager
☐ Descarga: Android SDK Platform 34
☐ Descarga: Android SDK Build-Tools 34
☐ Vuelve a ejecutar
```

### ❌ Emulador muy lento
```
SOLUCIÓN:
☐ Device Manager → editar dispositivo
☐ RAM Memory: sube a 4GB
☐ Click "Finish"
```

---

## 🎮 USANDO LA APP (Una vez abierta)

```
SPLASH SCREEN (3 segundos)
         ↓
LOGIN SCREEN
   Email: test@university.edu
   Password: 123456
   Click: Log In
         ↓
HOME MARKETPLACE
   ✅ Ves 6 productos
   ✅ Puedes hacer click en ellos
   ✅ Favoritos funcionan
   ✅ Bottom nav con 5 tabs
         ↓
NAVEGAR ENTRE PANTALLAS
   Abajo: 🏠 Categorías ➕ ❤️ 👤
   Click en cualquiera para cambiar
         ↓
✅ ¡ÉXITO! La app está funcionando
```

---

## ⏱️ TIEMPOS APROXIMADOS

```
Instalación Android Studio:     15-20 min
Abrir proyecto:                 2-5 min
Crear emulador:                 10-15 min
Primera compilación:            5-10 min
                                ───────────
TOTAL PRIMERA VEZ:              30-50 min

Siguientes compilaciones:       1-2 min
```

---

## 📞 AYUDA RÁPIDA

### "¿Por dónde empiezo?"
→ Abre Android Studio, luego File → Open, busca la carpeta kotlinviews

### "¿Dónde está la carpeta del proyecto?"
→ C:\Users\Acer\OneDrive - Universidad de los andes\Septimo Semestre\Móvil\kotlinviews

### "¿Cuánto tarda la primera vez?"
→ 30-50 minutos (descarga, instalación, compilación)

### "¿Qué hago si algo falla?"
→ Revisa la sección "❌ SEÑALES DE PROBLEMAS"

### "¿Puedo usar mi celular?"
→ Sí, si es Android. Habilita "USB Debugging" en Configuración

### "¿Dónde veo los errores?"
→ En Android Studio, abajo, en la ventana "Logcat"

---

## 🎉 RESUMEN EN 30 SEGUNDOS

1. Abre Android Studio
2. File → Open → Navega a kotlinviews → Open
3. Espera a que sincronice (Gradle)
4. Device Manager → Create device → Pixel 6 → Android 13
5. Click en el botón ▶ (Run)
6. Click en el emulador cuando pregunte
7. ESPERA 10 minutos en total
8. ¡App abre automáticamente!

---

## ✨ CUANDO FUNCIONE

Verás este flujo en el emulador:

```
SPLASH SCREEN 🏪
     ↓ (3 seg)
LOGIN SCREEN
(escribe: test@university.edu / 123456)
     ↓
HOME MARKETPLACE
(6 productos, buscador, categorías)
     ↓
✅ TODO FUNCIONA
```

---

**¡Ya estás listo para ejecutar UniMarket!** 🚀

**Siguientes pasos:**
1. Abre Android Studio
2. Abre el proyecto
3. Ejecuta la app
4. ¡Disfruta!

