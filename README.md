# 🏪 UniMarket - Student Marketplace App

Una aplicación móvil moderna y elegante para que estudiantes universitarios compren y vendan libros, notas, electrónica, calculadoras, muebles y otros materiales de estudio.

## 📱 Descripción General

**UniMarket** es un prototipo interactivo de UI con **12 pantallas totalmente funcionales** diseñadas con un **sistema de diseño neumórfico moderno**. La aplicación utiliza gradientes suaves, múltiples colores base y componentes elevados con sombras neumórficas para crear una experiencia visual premium.

## 🎨 Sistema de Diseño

### Colores Principales

| Color | Código | Uso |
|-------|--------|-----|
| **Primary Indigo** | `#4F46E5` | Botones primarios, headers |
| **Secondary Emerald** | `#10B981` | Botones secundarios, acciones |
| **Accent Orange** | `#F59E0B` | Destacados, precios |
| **Background Light** | `#F8F9FA` | Fondo general |
| **Surface White** | `#FFFFFF` | Tarjetas, superficies |

### Características del Diseño

✨ **Neumorfismo Moderno**
- Sombras suaves y graduales
- Superficies elevadas con profundidad
- Bordes redondeados suavizados
- Gradientes sutiles en lugar de colores planos

🎭 **Tipografía**
- Fuente: Sans Serif (similar a Inter/SF Pro)
- Jerarquía clara con pesos Bold, SemiBold y Regular
- Tamaños desde 10sp hasta 36sp

## 📊 Las 12 Pantallas

### 1️⃣ Splash Screen
- Logo y nombre de la aplicación
- Tagline "Student Marketplace"
- Animación de carga sutil (pulsación del logo)
- Navegación automática a Login después de 3 segundos

### 2️⃣ Login Screen
- Email y contraseña con iconos
- Botón "Olvidé contraseña"
- Opciones de login social (Google, Apple)
- Enlace a registro

### 3️⃣ Register Screen
- Campos: Nombre completo, email universitario, contraseña, confirmación
- Validación visual
- Enlace de retorno a login

### 4️⃣ Home Marketplace Feed
- Barra de búsqueda
- Filtros de categorías rápidos
- Grid de productos con:
  - Imagen del producto
  - Título y precio
  - Nombre del vendedor
  - Icono de favorito interactivo

### 5️⃣ Product Detail Screen
- Galería de imágenes
- Información completa del producto
- Vista previa del vendedor
- Botones "Contactar" y "Comprar"
- Detalles adicionales (categoría, ubicación, condición)

### 6️⃣ Create Listing Screen
- Carga de fotos
- Campos: Título, descripción, precio
- Selector de categoría
- Botón publicar

### 7️⃣ Categories Screen
- Grid de 6 categorías principales
- Cada categoría con icono y cantidad de items
- Colores únicos por categoría
- Navegación a resultados de búsqueda

### 8️⃣ Search Results Screen
- Barra de búsqueda visible
- Opciones de filtro y ordenamiento
- Cantidad de resultados
- Lista de productos

### 9️⃣ Favorites Screen
- Productos guardados con opción de eliminar
- Mismo diseño de tarjetas que el home
- Contador de items guardados

### 🔟 Messages Screen
- Lista de conversaciones
- Indicador de estado online/offline
- Vista previa del último mensaje
- Contador de mensajes sin leer
- Información del producto en conversación

### 1️⃣1️⃣ Chat Screen
- Burbujas de mensaje (usuario vs otros)
- Vista previa del producto
- Input de mensaje con botón enviar
- Estado online del usuario

### 1️⃣2️⃣ Profile Screen
- Avatar y datos del usuario
- Calificación y reseñas
- Estadísticas: Listados, compras, vendidas
- Mis listados (primeros 3)
- Opciones: Editar perfil, Configuración, Ayuda
- Botón de logout

## 🏗️ Estructura del Proyecto

```
app/
├── src/
│   ├── main/
│   │   ├── java/com/unimarket/app/
│   │   │   ├── MainActivity.kt              # Actividad principal
│   │   │   ├── data/
│   │   │   │   ├── MockData.kt              # Datos de prueba
│   │   │   │   └── models/
│   │   │   │       └── Models.kt            # Modelos de datos
│   │   │   └── ui/
│   │   │       ├── components/
│   │   │       │   └── NeumorphicComponents.kt
│   │   │       ├── navigation/
│   │   │       │   ├── Screen.kt            # Definición de rutas
│   │   │       │   ├── NavHost.kt           # Navegación principal
│   │   │       │   └── BottomNavigation.kt  # Barra inferior
│   │   │       ├── screens/
│   │   │       │   ├── SplashScreen.kt
│   │   │       │   ├── LoginScreen.kt
│   │   │       │   ├── RegisterScreen.kt
│   │   │       │   ├── HomeScreen.kt
│   │   │       │   ├── ProductDetailScreen.kt
│   │   │       │   ├── CreateListingScreen.kt
│   │   │       │   ├── CategoriesScreen.kt
│   │   │       │   ├── SearchResultsScreen.kt
│   │   │       │   ├── FavoritesScreen.kt
│   │   │       │   ├── MessagesScreen.kt
│   │   │       │   ├── ChatScreen.kt
│   │   │       │   └── ProfileScreen.kt
│   │   │       └── theme/
│   │   │           ├── Color.kt
│   │   │           ├── Theme.kt
│   │   │           └── Typography.kt
│   │   └── res/
│   │       ├── values/
│   │       │   ├── strings.xml
│   │       │   ├── colors.xml
│   │       │   └── themes.xml
│   │       └── values-es/
│   │           └── strings.xml
│   └── AndroidManifest.xml
├── build.gradle.kts
├── build.gradle (root)
└── settings.gradle.kts
```

## 🛠️ Tecnologías Utilizadas

- **Kotlin** - Lenguaje de programación
- **Jetpack Compose** - Framework de UI declarativo
- **Material Design 3** - Componentes de diseño
- **Navigation Compose** - Sistema de navegación
- **MockData** - Datos de prueba para prototipo

## 📦 Dependencias Principales

```kotlin
// Compose
androidx.compose.ui:ui
androidx.compose.material3:material3
androidx.compose.material:material-icons-extended

// Navigation
androidx.navigation:navigation-compose

// Lifecycle
androidx.lifecycle:lifecycle-runtime-ktx
```

## 🚀 Cómo Ejecutar

### Requisitos
- Android Studio 2023.1 o superior
- JDK 11 o superior
- Gradle 8.1 o superior

### Pasos

1. **Clonar el repositorio**
   ```bash
   git clone <repository-url>
   cd kotlinviews
   ```

2. **Abrir en Android Studio**
   - File → Open
   - Seleccionar la carpeta del proyecto

3. **Sincronizar Gradle**
   - Android Studio sincronizará automáticamente las dependencias

4. **Ejecutar en emulador**
   - Select Run → Run 'app'
   - Seleccionar un emulador Android

## 💡 Características Interactivas

✅ **Navegación completa** entre las 12 pantallas
✅ **Bottom Navigation Bar** funcional con 5 pestañas
✅ **Favoritos interactivos** (click para agregar/quitar)
✅ **Búsqueda y filtros** de categorías
✅ **Chat simulado** con burbujas de mensaje
✅ **Animaciones suaves** en splash y transiciones
✅ **Respuesta táctil** en todos los botones

## 📝 Datos Mock

La aplicación incluye datos ficticios realistas:

- **6 Productos** con detalles completos
- **6 Categorías** con iconos y colores
- **3 Conversaciones** activas
- **5 Mensajes** en el chat
- **3 Listados** del usuario
- **1 Perfil** de usuario completo

## 🎯 Próximas Fases (Futuro)

- [ ] Backend API con autenticación real
- [ ] Base de datos (Firestore/Room)
- [ ] Carga real de imágenes
- [ ] Sistema de pagos
- [ ] Push notifications
- [ ] Mapas de ubicación
- [ ] Calificaciones reales
- [ ] Sistema de mensajes en tiempo real

## 📄 Licencia

Este proyecto es un prototipo educativo.

## 👥 Autor

Desarrollado como parte de un proyecto académico de desarrollo móvil.

---

**UniMarket** - Making student marketplace simple, beautiful, and interactive 🚀

