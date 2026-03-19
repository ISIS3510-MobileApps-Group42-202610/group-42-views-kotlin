# 🎨 UniMarket Design System Guide

## Sistema de Colores

### Paleta Principal

```kotlin
// Primario
Primary Indigo: #4F46E5 (color principal, botones, headers)
Primary Indigo Light: #6366F1
Primary Indigo Dark: #4338CA

// Secundario
Secondary Emerald: #10B981 (secundario, acciones complementarias)
Secondary Emerald Light: #34D399
Secondary Emerald Dark: #059669

// Acento
Accent Orange: #F59E0B (destacados, precios)
Accent Orange Light: #FBBF24
Accent Orange Dark: #D97706

// Fondos y Neutrales
Background Light: #F8F9FA
Background Lighter: #FAFBFC
Surface White: #FFFFFF
Surface Gray: #F3F4F6

// Texto
Text Primary: #1F2937 (texto principal)
Text Secondary: #6B7280 (texto secundario)
Text Light: #9CA3AF (texto deshabilitado)

// Utilidad
Success Green: #10B981
Error Red: #EF4444
Warning Yellow: #FBBF24
Info Blue: #3B82F6
```

## Componentes Neumórficos

### 1. NeumorphicButton (Primario)

**Propiedades:**
- Elevación: 8dp
- Border radius: 12dp
- Padding: 24dp horizontal, 14dp vertical
- Color: Primary Indigo
- Sombra: soft black 10%, 15%
- Animación: ripple al presionar

**Uso:**
```kotlin
NeumorphicButton(
    text = "Comprar",
    onClick = { },
    modifier = Modifier
        .fillMaxWidth()
        .height(48.dp),
    isPrimary = true
)
```

### 2. SecondaryButton

**Propiedades:**
- Elevación: 4dp
- Border radius: 12dp
- Color: White con border Primary Indigo
- Padding: 24dp horizontal, 14dp vertical

**Uso:**
```kotlin
SecondaryButton(
    text = "Cancelar",
    onClick = { },
    modifier = Modifier.fillMaxWidth()
)
```

### 3. AccentButton

**Propiedades:**
- Elevación: 8dp
- Border radius: 12dp
- Color: Accent Orange
- Padding: 24dp horizontal, 14dp vertical

**Uso:**
```kotlin
AccentButton(
    text = "Publicar",
    onClick = { },
    modifier = Modifier.fillMaxWidth()
)
```

### 4. NeumorphicTextField

**Propiedades:**
- Elevación: 6dp
- Border radius: 12dp
- Fondo: White
- Padding: 12dp
- Placeholder color: Text Secondary
- Focus color: Primary Indigo
- Border: ninguno (transparente)

**Uso:**
```kotlin
NeumorphicTextField(
    value = email,
    onValueChange = { email = it },
    label = "Correo",
    modifier = Modifier.fillMaxWidth(),
    leadingIcon = {
        Icon(Icons.Default.Email, "Email")
    }
)
```

### 5. NeumorphicCard

**Propiedades:**
- Elevación: 6dp
- Border radius: 16dp
- Fondo: White
- Sombra: soft black 8%, 12%
- Padding: variable

**Uso:**
```kotlin
NeumorphicCard(
    modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)
) {
    // Contenido
}
```

## Tipografía

### Jerarquía Tipográfica

| Nivel | Tamaño | Peso | Uso |
|-------|--------|------|-----|
| Display Large | 36sp | Bold | Titles principales |
| Display Medium | 32sp | Bold | Headers grandes |
| Headline Large | 24sp | Bold | Títulos de sección |
| Headline Medium | 20sp | SemiBold | Subtítulos |
| Title Large | 16sp | SemiBold | Card titles |
| Body Large | 16sp | Regular | Contenido principal |
| Body Medium | 14sp | Regular | Texto general |
| Label Large | 14sp | SemiBold | Labels |
| Label Small | 10sp | SemiBold | Badges |

## Espaciado y Layout

### Espacios Estándar

```kotlin
4.dp   // Minimal
8.dp   // XSmall
12.dp  // Small
16.dp  // Medium (más usado)
20.dp  // Medium Large
24.dp  // Large
32.dp  // XLarge
48.dp  // 2XLarge
```

### Border Radius

```kotlin
4.dp   // Minimal (badges)
8.dp   // Small (chips)
12.dp  // Medium (inputs, buttons)
16.dp  // Large (cards)
20.dp  // XLarge (avatars)
```

### Elevación (Shadows)

```kotlin
2.dp   // Subtle (hovered)
4.dp   // Light (inputs)
6.dp   // Medium (cards)
8.dp   // Strong (buttons)
12.dp  // Extra strong (popovers)
```

## Animaciones

### Duración Estándar

```kotlin
150ms  // Ripples, hover states
300ms  // Transitions entre pantallas
500ms  // Entrada/salida de elementos
1500ms // Animaciones infinitas (loader)
```

## Estructura de Pantalla

### Home Screen Layout

```
┌─────────────────────┐
│   Header            │  // Greeting + Search
├─────────────────────┤
│   Category Chips    │  // Horizontal scroll
├─────────────────────┤
│   Product Cards     │  // Vertical list
│   - Card            │
│   - Card            │
│   - Card            │
└─────────────────────┘
   Bottom Navigation   // 5 tabs
```

### Card Product Layout

```
┌──────────────────────┐
│ ┌────┐ Title      ☆  │
│ │ 📚 │ Seller     ❤   │
│ │    │ ──────────────│
│ └────┘ $45.00        │
└──────────────────────┘
```

## Responsive Design

### Breakpoints

- **Mobile**: 360-599dp (teléfono)
- **Tablet Small**: 600-839dp (tablet 7")
- **Tablet Large**: 840+dp (tablet 10"+)

### Padding por Device

- **Mobile**: 16dp horizontal
- **Tablet**: 24dp horizontal

## Tema Dark (Futuro)

```kotlin
Primary: Primary Indigo (mantiene)
Background: #0F172A (very dark)
Surface: #1E293B (dark slate)
Text Primary: #FFFFFF (white)
Text Secondary: #CBD5E1 (light gray)
```

## Iconografía

### Tamaños Estándar

```kotlin
16.dp  // Small (inline, badges)
20.dp  // Small-Medium (navigation)
24.dp  // Medium (headers)
32.dp  // Large (hero)
40.dp  // Extra Large (avatars)
48.dp  // XXL (splash)
```

### Colores de Iconos

- **Primario**: Primary Indigo
- **Secundario**: Text Secondary
- **Error**: Error Red
- **Success**: Success Green
- **Neutral**: Surface Gray

## Accesibilidad

- **Contraste mínimo**: 4.5:1 para texto
- **Tamaño mínimo de toque**: 48x48dp
- **Espaciado entre toques**: 8dp

## Referencia Rápida de Componentes

| Componente | Elevación | BR | Color | Uso |
|----------|-----------|-------|-------|-----|
| Button | 8dp | 12dp | Primary | Acciones primarias |
| TextField | 6dp | 12dp | White | Inputs |
| Card | 6dp | 16dp | White | Contenedores |
| Chip | 4dp | 8dp | Gray | Filtros |
| Fab | 8dp | 12dp | Accent | Acciones flotantes |

---

**Nota**: Todos los componentes utilizan sombras neumórficas suaves para mantener la consistencia visual y el toque premium de la aplicación.

