# Reto-2---Avanzado

# Portafolio Personal o Chat

## Descripción del Proyecto

Este proyecto es una aplicación móvil que permite a los usuarios gestionar un portafolio personal o participar en un chat tipo red social. Puedes elegir entre dos tipos de aplicaciones al iniciar el proyecto:

1. **Aplicación de Portafolio Personal:** Permite a los usuarios crear y gestionar un portafolio personal, con funcionalidades para agregar, editar, eliminar y visualizar proyectos.

2. **Aplicación de Chat:** Permite a los usuarios iniciar conversaciones, enviar y recibir mensajes, y gestionar la lista de conversaciones.

## Requisitos Funcionales

### Pantalla de Inicio de Sesión/Registro
- Permite a los usuarios registrarse y autenticarse utilizando Firebase Authentication.
- Implementa el inicio de sesión con correo electrónico y contraseña.

### Pantalla Principal
- **Portafolio:** Muestra una lista de los proyectos del usuario.
- **Chat:** Muestra una lista de conversaciones del usuario.
- Permite agregar nuevos proyectos o iniciar nuevas conversaciones mediante un botón flotante de acción (FAB).

### Pantalla de Detalles del Proyecto o Conversación
- **Portafolio:** Muestra detalles de un proyecto seleccionado, incluyendo título, descripción, fecha de inicio, fecha de finalización, y una imagen opcional.
- **Chat:** Muestra los mensajes de una conversación seleccionada.
- Permite editar y eliminar proyectos o mensajes desde esta pantalla.

### Pantalla de Agregar/Editar Proyecto o Mensaje
- **Portafolio:** Formulario para agregar o editar proyectos con campos requeridos (Título, Descripción, Fecha de Inicio, Fecha de Finalización) y un campo opcional para imagen.
- **Chat:** Formulario para enviar nuevos mensajes.

### Almacenamiento de Datos
- Utiliza SQLite para el almacenamiento local de los proyectos o mensajes.
- Utiliza Firebase Firestore para la sincronización de los datos en la nube (opcional).

## Requisitos Técnicos

### Arquitectura
- Implementa el patrón MVP o MVVM para estructurar el código de la aplicación.

### Persistencia de Datos
- Utiliza SQLite para el almacenamiento local de proyectos o mensajes.
- Sincroniza los datos locales con Firebase Firestore para mantener una copia de seguridad en la nube (opcional).

### Autenticación
- Utiliza Firebase Authentication para gestionar el registro e inicio de sesión de los usuarios.

### Interfaz de Usuario
- Diseña una interfaz de usuario amigable y coherente con las guías de diseño de Material Design.

### Validación de Datos
- Valida los datos de entrada en los formularios (por ejemplo, campos requeridos no vacíos, fechas válidas, etc.).

## Instalación y Configuración

### Prerrequisitos
- [Node.js](https://nodejs.org/) (para la gestión de dependencias y herramientas de construcción)
- [Firebase CLI](https://firebase.google.com/docs/cli) (para configurar Firebase)
- [SQLite](https://www.sqlite.org/) (para la base de datos local)

### Clonación del Repositorio
```bash
git clone https://github.com/Killer531-alt/Reto-2---Avanzado.git
cd Reto-2---Avanzado
