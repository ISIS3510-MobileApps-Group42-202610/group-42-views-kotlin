# 🚀 CÓMO EJECUTAR UNIMARKET - GUÍA RÁPIDA

## ⚡ 3 PASOS PRINCIPALES

### 1️⃣ ABRIR EL PROYECTO EN ANDROID STUDIO

```
Android Studio 
  → File 
    → Open
      → Navega a: C:\Users\Acer\OneDrive - Universidad de los andes\Septimo Semestre\Móvil\kotlinviews
        → Selecciona la carpeta
          → Click Open
```

**Espera 2-5 minutos** (Gradle se sincroniza automáticamente)

Sabrás que terminó cuando en la esquina inferior derecha dice: "Gradle Build Finished"

---

### 2️⃣ CREAR UN EMULADOR (si no tienes celular Android)

Si TIENES celular Android, salta al paso 3 directo.

```
Android Studio
  → Device Manager (icono teléfono en lado derecho)
    → Click en "Create device"
      → Selecciona "Pixel 6" (recomendado)
        → Click "Next"
          → Selecciona "Android 13" (o superior)
            → Click "Next"
              → Click "Finish"
```

**Espera 5-10 minutos** (descarga el sistema Android)

Cuando termine, verás el emulador en la lista.

---

### 3️⃣ EJECUTAR LA APLICACIÓN

#### Opción A: Desde Android Studio (más fácil)

```
1. En Device Manager (lado derecho):
   → Haz click en el botón ▶ (play) al lado de tu emulador
   
   Espera 1-2 minutos a que arranque el emulador
   
2. En la barra superior de Android Studio:
   → Click en el botón verde ▶ "Run"
   
   O presiona: Shift + F10
   
3. Selecciona el emulador de la lista
   → Click "OK"
```

**Espera 5-10 minutos** (primera compilación)
**Siguientes veces: 1-2 minutos**

#### Opción B: Desde Terminal (alternativa)

```powershell
# Abre PowerShell en la carpeta del proyecto
cd "C:\Users\Acer\OneDrive - Universidad de los andes\Septimo Semestre\Móvil\kotlinviews"

# Sincroniza
.\gradlew sync

# Compila
.\gradlew build

# Ejecuta
.\gradlew run
```

---

## ✅ ¡LISTO!

Deberías ver en el emulador:

```
┌─────────────────────┐
│                     │
│      🏪             │
│                     │
│   UniMarket         │
│                     │
│ Student Marketplace │
│                     │
└─────────────────────┘
```

**Espera 3 segundos** → Auto navega a Login Screen

---

## 🎮 USAR LA APP

### En Login Screen:
```
Email: escribe cualquier email (ej: test@university.edu)
Password: escribe cualquier contraseña (ej: 123456)
Click: "Log In"
```

### En Home Marketplace:
```
✅ Verás 6 productos
✅ Puedes hacer click en cada producto
✅ Favoritos funcionan (click en ❤️)
✅ Bottom navigation con 5 tabs funciona
```

### Navegar entre pantallas:
```
Abajo hay 5 botones:
┌─────────────────────────────────┐
│ 🏠    🛍️    ➕    ❤️    👤    │
│Home  Cats  Create Saved Profile │
└─────────────────────────────────┘

Click en cualquiera para cambiar de pantalla
```

---

## 🆘 SOLUCIONAR PROBLEMAS

### ❌ "Gradle sync failed"
```powershell
# En la terminal del proyecto
.\gradlew clean
.\gradlew sync
```

### ❌ "SDK not found"
```
Android Studio
  → Tools
    → SDK Manager
      → Descarga: "Android SDK Platform 34"
      → Descarga: "Android SDK Build-Tools"
```

### ❌ Emulador no aparece
```
Device Manager (lado derecho)
  → Click el botón ▶ de tu emulador
  → Espera 2 minutos
```

### ❌ App muy lenta
```
Device Manager
  → Click 3 puntitos al lado del emulador
    → "Edit Device"
      → RAM Memory: cambia a 4GB
```

### ❌ Aplicación no carga
```
Device Manager
  → Click 3 puntitos
    → "Wipe Data"
  → Vuelve a ejecutar
```

---

## ⏱️ TIEMPOS ESPERADOS

| Acción | Tiempo |
|--------|--------|
| Abrir Android Studio | 30 seg |
| Sincronizar Gradle (1ª vez) | 2-5 min |
| Crear emulador | 5-10 min |
| Descargar Android OS | 10-15 min |
| Primera compilación | 5-10 min |
| Iniciar emulador | 1-2 min |
| **TOTAL PRIMERA VEZ** | **20-40 min** |
| **COMPILACIONES SIGUIENTES** | **1-2 min** |

---

## 📱 SI TIENES CELULAR ANDROID

### 1. Preparar celular (1 minuto)

```
Celular
  → Ajustes/Configuración
    → Acerca del Teléfono
      → Toca "Número de Compilación" 7 veces consecutivas
        → Vuelve atrás en el menú
          → Ahora debería aparecer "Opciones para Desarrolladores"
            → Abre "Opciones para Desarrolladores"
              → Activa "Depuración por USB"
                → Acepta la advertencia
```

### 2. Conectar celular (1 minuto)

```
1. Conecta tu celular con cable USB a la computadora
2. El celular pedirá permiso → Acepta
3. En Android Studio debería aparecer tu celular en el selector de dispositivos
```

### 3. Ejecutar (1 minuto)

```
Android Studio
  → Click en el botón verde ▶ "Run"
    → Selecciona tu celular de la lista
      → Click "OK"
```

---

## 🎯 CHECKLIST

Marca cuando completes cada paso:

- [ ] Android Studio instalado
- [ ] Proyecto abierto en Android Studio
- [ ] Gradle sincronizado (ves "Gradle Build Finished" abajo)
- [ ] Emulador creado O celular conectado
- [ ] Click en el botón ▶ "Run"
- [ ] App compila y abre
- [ ] Ves el Splash Screen con el logo 🏪
- [ ] Pasados 3 segundos llegas a Login
- [ ] Escribes email/password
- [ ] Click en "Log In"
- [ ] Ves Home con 6 productos
- [ ] Bottom navigation funciona

✅ Si completaste todo = **¡UniMarket está funcionando!**

---

## 📖 DOCUMENTACIÓN ADICIONAL

Para más detalles sobre la app:

- **USAGE_GUIDE.md** - Cómo usar cada pantalla
- **DESIGN_SYSTEM.md** - Sistema de diseño y componentes
- **ARCHITECTURE.md** - Cómo está construida internamente
- **README.md** - Descripción general del proyecto

---

## 💬 ¿Necesitas Ayuda?

**Errores comunes:**

1. **"Gradle sync failed"** → Ejecuta `.\gradlew clean`
2. **"SDK not found"** → Descarga en SDK Manager
3. **"Emulador lento"** → Aumenta RAM a 4GB
4. **"App se congela"** → Cierra y vuelve a ejecutar

**Si algo más falla:**
- Revisa los mensajes en Logcat (abajo de Android Studio)
- Busca el error en Google
- O contacta al equipo de desarrollo

---

**UniMarket v1.0** 🏪
*Marketplace para estudiantes*

¡Disfruta usando la app! 🚀

