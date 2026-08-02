# SiChef! 🍳✨ <!-- Cambiar por el nombre final si varía -->
> **Tu experiencia gastronómica comienza aquí.**

[![Stack](https://shields.io)](https://github.com)
[![License](https://shields.io)](LICENSE)
[![Stage](https://shields.io)](https://github.com)

**SiChef!** es la primera plataforma inteligente que conecta de forma ágil a usuarios con chefs profesionales, experiencias gastronómicas premium, catering, proveedores y servicios para eventos. Diseñada bajo los pilares de la economía colaborativa, un marketplace robusto y un motor avanzado de Inteligencia Artificial, SiChef! no es solo una app para contratar cocineros: es el ecosistema digital gastronómico más completo del mundo.

---

## 🚀 Visión y Propósito
Transformar la gastronomía global permitiendo que cualquier persona pueda vivir una experiencia culinaria profesional en cualquier lugar del mundo. Desde una cena romántica íntima para dos personas hasta un evento corporativo masivo de cientos de invitados, emulando la fluidez operativa y estética de gigantes como **Airbnb, Uber, OpenTable y Apple**.

---

## 🧠 Características Inteligentes y Módulos Core

### 1. Asistente y Motor de IA Gastronómico
* **Buscador Inteligente:** El usuario describe un plato, ingrediente, ocasión o país, y la IA genera fichas profesionales instantáneas (historia, maridaje, costos, dificultad y chefs idóneos).
* **Cálculo Automático de Recursos:** Al emparejar un chef, plato e invitados, la IA procesa la lista exacta de compras, ingredientes, tiempos de preparación, personal de staff requerido y presupuesto final.
* **Copiloto Culinario:** Capaz de diseñar menús personalizados, detectar alérgenos, sugerir reemplazos de ingredientes y optimizar costos.

### 2. Ecosistema de Usuarios
* **Clientes:** Reserva de experiencias, gestión de eventos personalizados, compras directas y seguimiento en tiempo real de su servicio.
* **Chefs:** Suite de administración con publicación de menús, control de agenda, fijación de precios, analíticas de ingresos y herramientas de promoción.

### 3. Marketplace 360° e Integración de Eventos
* **Proveedores Gastronómicos:** Compra integrada a comercios asociados (supermercados, vinerías, carnicerías, tiendas gourmet).
* **Logística de Eventos (Staff Adicional):** Contratación en un clic de mozos, bartenders, sommeliers, DJs, fotógrafos, seguridad y coordinadores.
* **Alquiler de Equipamiento:** Solución integral de vajilla, cristalería, barras móviles y mobiliario.

### 4. Capas de Gamificación y Redes Sociales
* Sistema de puntos, logros, insignias de especialidad y rankings públicos ("Chefs Destacados" / "Clientes VIP").
* Integración nativa con Instagram, TikTok y WhatsApp para compartir historias y recuerdos multimedia del evento etiquetando al chef profesional.

---

## 🛠️ Stack Tecnológico y Arquitectura

La plataforma está diseñada con tecnologías modernas, escalables y preparadas para soportar alta disponibilidad de nivel internacional:

### Frontend (Mobile / Web)
* **Framework:** Next.js (React) con TypeScript.
* **Estilos y Animaciones:** Tailwind CSS + Framer Motion (Interfaz limpia, premium y minimalista).
* **Mapas:** Google Maps API (Seguimiento del chef en tiempo real).

### Backend y Base de Datos
* **Framework:** NestJS (Node.js) estructurado con Clean Architecture.
* **Bases de Datos:** PostgreSQL (Datos relacionales) + Redis (Manejo de sesiones, caché y colas en tiempo real).
* **Autenticación:** Firebase Authentication.

### Infraestructura, Servicios e IA
* **Inteligencia Artificial:** OpenAI API (Modelado de menús, búsquedas y cálculos logísticos).
* **Almacenamiento Multimedia:** Cloudinary / AWS S3 (Imágenes y videos de perfiles de chefs en alta resolución).
* **Pasarelas de Pago:** Stripe / Mercado Pago (Soporte multi-moneda, transferencias y pagos locales).

---

## 🎨 Identidad Visual y UI/UX
* **Paleta de Colores:** Predominancia de 🟠 **Naranja** (Energía y gastronomía) complementado con 🔵 Celeste, 🟣 Violeta, 🟢 Verde y ❤️ Magenta.
* **Isologo:** Estilo lineal premium, minimalista y limpio. Muestra a un chef sonriendo de frente decorando un plato gourmet con pinzas de precisión, flanqueado por una copa de vino.
* **Objetivo UX:** Interfaz fluida basada en microinteracciones premium que combinan la inmediatez de *PedidoYa/Uber Eats* con la exclusividad de selección de *Airbnb*.

---

## 💼 Modelo de Monetización (Growth Strategy)
1. **Comisión por Reserva:** Porcentaje transaccional sobre el servicio del chef.
2. **Take Rate del Marketplace:** Comisión sobre ventas de proveedores asociados y staff contratado.
3. **Suscripción SaaS (SaaS-enabled Marketplace):** Modelos premium para chefs con herramientas avanzadas de marketing.
4. **Membresías VIP:** Clientes con beneficios exclusivos, prioridad de reserva y eventos patrocinados.

---

## 📦 Instalación y Configuración de Desarrollo

### Requisitos Previos
* Node.js (versión 18 o superior)
* PostgreSQL y Redis activos

### Pasos
1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com
   cd sichef-platform
   ```

2. **Instalar dependencias del Monorepo / Proyecto:**
   ```bash
   npm install
   ```

3. **Configurar variables de entorno (`.env`):**
   Crea un archivo `.env` en la raíz del backend y frontend usando como base los archivos `.env.example`. Asegúrate de ingresar tus credenciales de OpenAI, Stripe, Mercado Pago y Firebase.

4. **Correr en entorno local:**
   ```bash
   # Para levantar el Backend (NestJS)
   npm run start:dev --prefix backend

   # Para levantar el Frontend (Next.js)
   npm run dev --prefix frontend
   ```

---

## 📄 Licencia
Este proyecto se distribuye bajo la licencia MIT. Consulta el archivo `LICENSE` para obtener más información.
