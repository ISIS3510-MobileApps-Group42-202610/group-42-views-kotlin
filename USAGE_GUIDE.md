# 📖 Guía de Uso - UniMarket App

## Navegación en la Aplicación

### Flujo Principal

1. **Splash Screen** (3 segundos)
   - Se muestra logo y nombre
   - Transición automática a Login

2. **Login Screen**
   - Ingresar correo y contraseña
   - Opción "Forgot Password"
   - Botón social login (Google/Apple)
   - Enlace a "Register"

3. **Home Marketplace**
   - Vista principal con productos
   - Búsqueda y filtros de categoría
   - Click en producto → Product Detail

### Estructura de Tabs (Bottom Navigation)

```
┌─────┬──────────┬────────┬────────┬─────────┐
│Home │Categories│ Create │ Saved  │ Profile │
└─────┴──────────┴────────┴────────┴─────────┘
```

## Interacciones por Pantalla

### 1. Splash Screen
```
Acción: Automática
Tiempo: 3 segundos
Destino: Login Screen
Animación: Icono pulsa
```

### 2. Login Screen
- **Email**: Ingresar email universitario
- **Password**: Ingresar contraseña
- **"Log In"**: Navega a Home
- **"Forgot Password?"**: Acción (sin implementar)
- **Google/Apple**: Acciones (sin implementar)
- **"Register"**: Navega a Register Screen

### 3. Register Screen
- **Full Name**: Campo de texto
- **University Email**: Campo de email
- **Password**: Campo con máscara
- **Confirm Password**: Confirmación
- **"Create Account"**: Navega a Home
- **"Log In"**: Retorna a Login

### 4. Home Marketplace Feed
```
┌─ Header ──────────────────────┐
│ 👋 Hello Alexandra           │
│ What are you looking for?    │
│                              │
│ [🔍 Search books, notes...]  │
│                              │
│ [All][Books][Electronics]... │
└──────────────────────────────┘

┌─ Products ────────────────────┐
│ ┌──────────────────────────┐  │
│ │ 📚 Title          $45 ❤  │  │
│ │ Seller Name              │  │
│ └──────────────────────────┘  │
│                              │
│ ┌──────────────────────────┐  │
│ │ 🧮 Title          $120 ❤ │  │
│ │ Seller Name              │  │
│ └──────────────────────────┘  │
└──────────────────────────────┘
```

**Interacciones:**
- Tap en categoría chip: Filtra productos
- Tap en corazón: Agrega/quita favorito
- Tap en producto: Navega a Product Detail
- Tap en buscador: Simula búsqueda

### 5. Product Detail Screen
```
┌─────────────────────────────────┐
│ ← 🔗 ❤                          │
├─────────────────────────────────┤
│                                 │
│          [📚 Imagen]            │
│                                 │
├─────────────────────────────────┤
│ Advanced Calculus Textbook  ⭐4.8│
│ $45.00       (42 reviews)       │
│                                 │
│ ┌─ Seller ──────────────────────┤
│ │ Maria Garcia               ⭐  │
│ │ 4.8 • 42 reviews              │
│ └────────────────────────────────┤
│                                 │
│ Description                     │
│ Like new condition, used for... │
│                                 │
│ ┌─ Details ──────────────────────┤
│ │ Books | Campus Blvd | Like New │
│ └────────────────────────────────┤
│                                 │
│ [💬 Message]  [🛒 Buy Now]     │
└─────────────────────────────────┘
```

**Interacciones:**
- ← : Retorna a Home
- ❤ : Toggle favorito
- 🔗 : Compartir (sin implementar)
- "Message": Navega a Chat
- "Buy Now": Acción (sin implementar)

### 6. Create Listing Screen
```
┌──────────────────────────────┐
│ ← Create Listing             │
├──────────────────────────────┤
│ ┌─ Image Upload ────────────┐│
│ │ 🖼️  Tap to add photos     ││
│ └───────────────────────────┘│
│                              │
│ Title                        │
│ [Item title...........]      │
│                              │
│ Description                  │
│ [Describe your item....]     │
│                              │
│ Price (USD)                  │
│ [$0.00...............]       │
│                              │
│ Category                     │
│ [Books][Elec][Notes][Furn]   │
│                              │
│ [📤 Publish Listing]         │
└──────────────────────────────┘
```

### 7. Categories Screen
```
┌──────────────────────────────┐
│ Categories                   │
│ Browse by category           │
│                              │
│ ┌────────────┬────────────┐ │
│ │ 📚         │ 📝         │ │
│ │ Books      │ Notes      │ │
│ │ 234 items  │ 156 items  │ │
│ └────────────┴────────────┘ │
│                              │
│ ┌────────────┬────────────┐ │
│ │ 🖥️         │ 🧮        │ │
│ │ Electronics│ Calculators│ │
│ │ 89 items   │ 45 items   │ │
│ └────────────┴────────────┘ │
│                              │
│ ┌────────────┬────────────┐ │
│ │ 🪑         │ 🤝         │ │
│ │ Furniture  │ Services   │ │
│ │ 72 items   │ 38 items   │ │
│ └────────────┴────────────┘ │
└──────────────────────────────┘
```

**Interacciones:**
- Tap en categoría: Navega a Search Results

### 8. Search Results Screen
```
┌──────────────────────────────┐
│ ← Search Results             │
│   "calculators"              │
│                              │
│ [🔽 Filter] [↕️ Sort: Rel]   │
│                              │
│ Found 3 items                │
│                              │
│ [Product Cards...]           │
└──────────────────────────────┘
```

### 9. Favorites Screen
```
┌──────────────────────────────┐
│ Saved Items                  │
│ 3 saved items                │
│                              │
│ [Product Cards con 🗑️]       │
└──────────────────────────────┘
```

### 10. Messages Screen
```
┌──────────────────────────────┐
│ Messages                     │
│ 3 conversations              │
│                              │
│ ┌────────────────────────────┤
│ │👩 Maria Garcia        2m   │
│ │🟢 Is this still available?│
│ │   About: Advanced Calc  [1]│
│ └────────────────────────────┤
│                              │
│ ┌────────────────────────────┤
│ │👨 John Smith         1h    │
│ │ Can you deliver tomorrow?  │
│ │ About: Scientific Calc     │
│ └────────────────────────────┤
│                              │
│ ┌────────────────────────────┤
│ │👩 Sarah Chen          5h   │
│ │ Perfect! I'll take it      │
│ │ About: Study Notes - Bio   │
│ └────────────────────────────┤
└──────────────────────────────┘
```

**Interacciones:**
- Tap en conversación: Navega a Chat

### 11. Chat Screen
```
┌──────────────────────────────┐
│ ← Maria Garcia      🟢 Online │
├──────────────────────────────┤
│ ┌────────────────────────────┤
│ │ 📚 Advanced Calculus       │
│ │ Tap to view details        │
│ └────────────────────────────┤
│                              │
│              [Mensaje user]  │
│                              │
│ [Mensaje otro] 🟡            │
│                              │
│              [Mensaje user]  │
│                              │
│ ┌────────────────────────────┤
│ │[Escribe aquí.....]  [↑]   │
│ └────────────────────────────┘
```

**Interacciones:**
- Tap en producto: (sin implementar)
- Input de mensaje: Enviar (simula)
- ← : Retorna a Messages

### 12. Profile Screen
```
┌──────────────────────────────┐
│          👤                  │
│    Alexandra Silva           │
│  ⭐ 4.9 • 127 reviews        │
│  alexandra@university.edu    │
│  📍 Campus Avenue            │
│                              │
│ [Listings][Purchases][Sold]  │
│    2         12        8      │
│                              │
│ My Listings                  │
│ ┌────────────────────────────┤
│ │ Advanced Calc    $45 Active│
│ │ 234 views • 2 days ago     │
│ │                            │
│ │ Laptop Cooling   $28 Active│
│ │ 156 views • 1 week ago     │
│ │                            │
│ │ Physics Lab      $32  Sold │
│ │ 89 views • 2 weeks ago     │
│ └────────────────────────────┤
│                              │
│ [✏️ Edit Profile]            │
│ [⚙️ Settings]                │
│ [❓ Help & Support]          │
│                              │
│ [🚪 Log Out]                 │
└──────────────────────────────┘
```

**Interacciones:**
- Tap en listing: (sin implementar)
- Tap en opciones: (sin implementar)
- "Log Out": Navega a Login

## Funcionalidades de Mock Data

### Datos Disponibles

**Productos (6):**
1. Advanced Calculus Textbook - $45.00
2. Scientific Calculator TI-84 - $120.00
3. Study Notes - Biology 101 - $15.00
4. Wooden Desk Lamp - $35.00
5. Organic Chemistry Solutions Manual - $25.00
6. Laptop Cooling Pad - $28.00

**Categorías (6):**
- 📚 Books (234)
- 📝 Notes (156)
- 🖥️ Electronics (89)
- 🧮 Calculators (45)
- 🪑 Furniture (72)
- 🤝 Services (38)

**Conversaciones (3):**
- Maria Garcia - "Is this still available?" (2 min, 1 unread)
- John Smith - "Can you deliver tomorrow?" (1 hour)
- Sarah Chen - "Perfect! I'll take it" (5 hours)

**Mensajes en Chat (5):**
Conversación entre usuario y Maria sobre el libro de Calculus.

**Mis Listados (3):**
1. Advanced Calculus - $45 - Active
2. Laptop Cooling Pad - $28 - Active
3. Physics Lab Manual - $32 - Sold

## Tips de Uso

✅ **Para experimentar todas las pantallas:**
1. Comienza desde Splash
2. Pasa login/register
3. Explora Home
4. Navega por Categories
5. Crea un listing
6. Mira favoritos
7. Revisa mensajes y chat
8. Visita perfil

✅ **Para probar favoritos:**
- Click en el ❤️ en cualquier producto
- Ir a Favorites para verlos guardados

✅ **Para buscar productos:**
- Click en el buscador (no hace búsqueda, es mock)
- O navega a Categories y selecciona una

## Notas Técnicas

- Todos los datos son mock (en MockData.kt)
- No hay persistencia de datos
- Los favoritos se resetean al recargar
- Los mensajes no se guardan
- Todas las acciones "sin implementar" son placeholders

---

**¡Disfruta explorando UniMarket!** 🚀

