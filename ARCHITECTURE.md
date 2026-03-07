# 🏗️ Arquitectura del Proyecto UniMarket

## Visión General

UniMarket sigue una arquitectura modular basada en **Jetpack Compose** con separación clara de responsabilidades.

```
┌─────────────────────────────────────────┐
│         UI Layer (Screens)              │
│  ┌─────────────────────────────────────┐│
│  │ 12 Pantallas Interactivas          ││
│  │ (HomeScreen, LoginScreen, etc)     ││
│  └─────────────────────────────────────┘│
│              ↓                          │
│  ┌─────────────────────────────────────┐│
│  │ Navigation Layer                   ││
│  │ (NavHost, BottomNavigation)        ││
│  └─────────────────────────────────────┘│
└─────────────────────────────────────────┘
              ↓
┌─────────────────────────────────────────┐
│      Component Layer                    │
│  (Buttons, Cards, TextFields)          │
└─────────────────────────────────────────┘
              ↓
┌─────────────────────────────────────────┐
│      Theme Layer                        │
│  (Colors, Typography, Themes)          │
└─────────────────────────────────────────┘
              ↓
┌─────────────────────────────────────────┐
│      Data Layer                         │
│  (MockData, Models)                    │
└─────────────────────────────────────────┘
```

---

## 1. Capa de Presentación (UI Layer)

### Pantallas (Screens)

Cada pantalla es un composable `@Composable` independiente que maneja su propio estado y navegación.

```kotlin
@Composable
fun HomeScreen(onNavigateToProduct: (String) -> Unit) {
    // Estado local
    var searchQuery by remember { mutableStateOf("") }
    
    // UI
    Column {
        // Header
        // Search Bar
        // Category Filters
        // Product List
    }
}
```

**Características:**
- Estado local con `remember`
- Callbacks para navegación
- Composición hierarchical
- Reusable components

### Archivos de Pantallas

```
screens/
├── SplashScreen.kt          → Splash con animación
├── LoginScreen.kt           → Autenticación UI
├── RegisterScreen.kt        → Registro de usuario
├── HomeScreen.kt            → Marketplace principal
├── ProductDetailScreen.kt   → Detalle de producto
├── CreateListingScreen.kt   → Crear anuncio
├── CategoriesScreen.kt      → Categorías grid
├── SearchResultsScreen.kt   → Resultados búsqueda
├── FavoritesScreen.kt       → Productos guardados
├── MessagesScreen.kt        → Conversaciones
├── ChatScreen.kt            → Chat individual
└── ProfileScreen.kt         → Perfil usuario
```

---

## 2. Capa de Componentes (Component Layer)

### Componentes Reutilizables

`NeumorphicComponents.kt` contiene 5 componentes base que se usan en múltiples pantallas:

```kotlin
// 1. NeumorphicButton - Botón primario
@Composable
fun NeumorphicButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    isPrimary: Boolean = true
)

// 2. SecondaryButton - Botón secundario
@Composable
fun SecondaryButton(
    text: String,
    onClick: () -> Unit
)

// 3. AccentButton - Botón acento
@Composable
fun AccentButton(
    text: String,
    onClick: () -> Unit
)

// 4. NeumorphicTextField - Input de texto
@Composable
fun NeumorphicTextField(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    isPassword: Boolean = false
)

// 5. NeumorphicCard - Tarjeta elevada
@Composable
fun NeumorphicCard(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
)
```

### Composables Secundarios

Cada pantalla también define composables menores:

```kotlin
// HomeScreen.kt
@Composable fun CategoryChip(...)
@Composable fun ProductCard(...)

// ChatScreen.kt
@Composable fun MessageBubble(...)

// ProfileScreen.kt
@Composable fun StatCard(...)
@Composable fun ListingItem(...)
@Composable fun SettingItem(...)
```

---

## 3. Capa de Navegación (Navigation Layer)

### NavHost Principal

`NavHost.kt` orquesta la navegación entre las 12 pantallas.

```kotlin
@Composable
fun UniMarketNavHost(
    navController: NavHostController,
    startDestination: String = Screen.Splash.route
) {
    NavHost(navController, startDestination) {
        composable(Screen.Splash.route) { ... }
        composable(Screen.Login.route) { ... }
        // ... más rutas
    }
}
```

### Definición de Rutas

`Screen.kt` define todas las rutas disponibles:

```kotlin
sealed class Screen(val route: String) {
    object Splash : Screen("splash")
    object Login : Screen("login")
    object Home : Screen("home")
    
    object ProductDetail : Screen("product_detail/{productId}") {
        fun createRoute(productId: String) = "product_detail/$productId"
    }
    // ... más rutas
}
```

### Bottom Navigation

`BottomNavigation.kt` implementa la barra inferior con 5 tabs:

```
┌─────┬──────────┬────────┬────────┬──────────┐
│Home │Categories│ Create │Saved   │Profile   │
└─────┴──────────┴────────┴────────┴──────────┘
```

---

## 4. Capa de Tema (Theme Layer)

### Sistema de Colores

`Color.kt` define la paleta completa:

```kotlin
val PrimaryIndigo = Color(0xFF4F46E5)
val SecondaryEmerald = Color(0xFF10B981)
val AccentOrange = Color(0xFFF59E0B)
// ... 16 colores más
```

### Tipografía

`Typography.kt` define estilos de fuente:

```kotlin
val UniMarketTypography = Typography(
    displayLarge = TextStyle(...),  // 36sp Bold
    headlineLarge = TextStyle(...), // 24sp Bold
    bodyLarge = TextStyle(...),     // 16sp Regular
    // ... 9 estilos más
)
```

### Tema Global

`Theme.kt` aplica colores y tipografía:

```kotlin
@Composable
fun UniMarketTheme(
    darkTheme: Boolean = isSystemInDarkMode(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = colorScheme,
        typography = UniMarketTypography,
        content = content
    )
}
```

---

## 5. Capa de Datos (Data Layer)

### Modelos de Datos

`Models.kt` define 6 data classes:

```kotlin
data class Product(...)       // Productos del marketplace
data class Category(...)      // Categorías
data class User(...)          // Usuario actual
data class Message(...)       // Mensajes de chat
data class Conversation(...)  // Conversaciones
data class Listing(...)       // Anuncios del usuario
```

### Mock Data

`MockData.kt` proporciona datos de prueba realistas:

```kotlin
object MockData {
    val mockProducts = listOf(...)        // 6 productos
    val mockCategories = listOf(...)      // 6 categorías
    val mockUser = User(...)              // 1 usuario
    val mockConversations = listOf(...)   // 3 conversaciones
    val mockMessages = listOf(...)        // 5 mensajes
    val mockListings = listOf(...)        // 3 anuncios
}
```

---

## Flujo de Datos

```
MockData (MockData.kt)
    ↓
Models (Models.kt)
    ↓
Screens (HomeScreen.kt, etc)
    ↓
Components (NeumorphicComponents.kt)
    ↓
Theme (Color.kt, Typography.kt)
    ↓
MainActivity.kt
```

---

## Patrones de Diseño Utilizados

### 1. Composable Functions
Cada UI es una función pura que recibe datos y callbacks.

### 2. Sealed Classes
`Screen` usa sealed class para tipificar seguro las rutas.

### 3. Remember & State
`remember` y `mutableStateOf` para estado local transitorio.

### 4. Higher-Order Functions
Callbacks para navegación (`onNavigateTo...`).

### 5. Modular Components
Componentes pequeños y reutilizables.

### 6. Separation of Concerns
- UI separada de navegación
- Navegación separada de datos
- Tema separado de componentes

---

## Principios de Arquitectura

### 1. Single Responsibility
Cada archivo/función tiene una responsabilidad clara.

### 2. Don't Repeat Yourself
Los componentes se reutilizan (NeumorphicButton en 10+ pantallas).

### 3. Composition over Inheritance
Composición de funciones en lugar de herencia.

### 4. Testability
Cada función es pura y testeable.

### 5. Scalability
Fácil agregar nuevas pantallas sin modificar existentes.

---

## Estructura de Llamadas

### Navegación entre Pantallas

```
MainActivity.kt
    ↓
UniMarketNavHost.kt
    ↓
NavHost (Compose)
    ├── SplashScreen → onNavigateToLogin
    │                      ↓
    │                LoginScreen → onNavigateToHome
    │                      ↓
    │               HomeScreen → onNavigateToProduct
    │                      ↓
    │            ProductDetailScreen
    │
    ├── Navigation.navigate(route)
    │
    └── BottomNavigationBar
         └── navController.navigate(item.route)
```

### Flujo de Usuario

```
Splash (3s) 
  ↓
Login → Register → Home
  ↓
Categories → SearchResults
  ↓
Favorites → Messages → Chat
  ↓
Profile → ProductDetail
```

---

## Estructura de Carpetas Recomendada

```
app/src/main/java/com/unimarket/app/
├── MainActivity.kt
├── data/
│   ├── MockData.kt               (datos de prueba)
│   └── models/
│       └── Models.kt             (data classes)
├── ui/
│   ├── components/
│   │   └── NeumorphicComponents.kt (5 componentes)
│   ├── navigation/
│   │   ├── Screen.kt             (definición de rutas)
│   │   ├── NavHost.kt            (navegación principal)
│   │   └── BottomNavigation.kt   (barra inferior)
│   ├── screens/
│   │   ├── SplashScreen.kt
│   │   ├── LoginScreen.kt
│   │   ├── RegisterScreen.kt
│   │   ├── HomeScreen.kt
│   │   ├── ProductDetailScreen.kt
│   │   ├── CreateListingScreen.kt
│   │   ├── CategoriesScreen.kt
│   │   ├── SearchResultsScreen.kt
│   │   ├── FavoritesScreen.kt
│   │   ├── MessagesScreen.kt
│   │   ├── ChatScreen.kt
│   │   └── ProfileScreen.kt
│   └── theme/
│       ├── Color.kt              (19 colores)
│       ├── Theme.kt              (MaterialTheme setup)
│       └── Typography.kt         (12 estilos de fuente)
```

---

## Extensibilidad

### Agregar Nueva Pantalla

```kotlin
// 1. Definir ruta en Screen.kt
object MyScreen : Screen("my_screen")

// 2. Crear composable
@Composable
fun MyScreen(...) { ... }

// 3. Agregar a NavHost
composable(Screen.MyScreen.route) {
    MyScreen(...)
}

// 4. Navegar desde otra pantalla
navController.navigate(Screen.MyScreen.route)
```

### Agregar Nuevo Componente

```kotlin
// En NeumorphicComponents.kt
@Composable
fun MyComponent(
    text: String,
    onClick: () -> Unit
) {
    // Implementación
}

// Usar en cualquier pantalla
MyComponent(text = "Test", onClick = { })
```

---

## Dependencias de Arquitectura

```
MainActivity
    ↓
UniMarketTheme (theme/)
    ↓
UniMarketNavHost (navigation/)
    ├── NavHost
    ├── BottomNavigationBar
    └── Screens (screens/)
        ├── HomeScreen
        │   └── Components (NeumorphicButton, ProductCard)
        ├── LoginScreen
        │   └── Components (NeumorphicTextField, NeumorphicButton)
        └── ... (otras pantallas)
        
Components (components/)
    └── Theme (Color.kt, Typography.kt)

Data (data/)
    └── Models (models/)
```

---

## Performance

### Optimizaciones Implementadas

1. **remember** para memoizar estado
2. **key** en LazyColumn para renderizado eficiente
3. **Composables** puros sin side effects
4. **lambda** capturadas correctamente
5. **Modifier** aplicados correctamente

### Potenciales Mejoras

- [ ] ViewModel con StateFlow
- [ ] Repository pattern
- [ ] Dependency Injection
- [ ] Coroutines para async
- [ ] Caching de datos

---

## Testing

### Unit Tests (Potencial)

```kotlin
@Test
fun testProductCardRendering() { ... }

@Test
fun testNavigationFlow() { ... }
```

### UI Tests (Potencial)

```kotlin
@get:Rule
val composeTestRule = createComposeRule()

@Test
fun testHomeScreenDisplaysProducts() { ... }
```

---

## Conclusión

La arquitectura de UniMarket es:

✅ **Modular** - Componentes independientes y reutilizables
✅ **Escalable** - Fácil agregar nuevas features
✅ **Mantenible** - Código organizado y documentado
✅ **Testeable** - Funciones puras sin side effects
✅ **Moderna** - Usa las mejores prácticas de Compose

---

**UniMarket Architecture v1.0**
*Construida con Jetpack Compose + Kotlin*

