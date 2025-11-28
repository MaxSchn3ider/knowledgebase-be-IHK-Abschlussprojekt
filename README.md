# Internal Developer Knowledge & Onboarding Portal

## 📘 Überblick

In der Entwicklungsabteilung der Arvato SE besteht aktuell die Herausforderung, neues Personal effizient einzuarbeiten und gleichzeitig den Wissensaustausch zwischen bestehenden Mitarbeitern zu verbessern.  
Gerade bei technischen oder projektspezifischen Fragestellungen ist es schwierig, schnell herauszufinden, wer im Team über die benötigte Expertise verfügt. Häufig werden mehrere Kollegen nacheinander angesprochen, bis sich ein geeigneter Ansprechpartner findet – ein Prozess, der Ressourcen bindet und unnötig viel Zeit kostet.

Um dieses Problem nachhaltig zu lösen, entsteht eine interne Webplattform, die Mitarbeiter, ihre Fähigkeiten und ihre Projektbeteiligungen zentral sichtbar macht. Jeder Mitarbeitende kann ein eigenes Profil erstellen, technische Kenntnisse hinterlegen und aktive Projekte darstellen. So wird Wissen zugänglich, Suchprozesse werden deutlich beschleunigt und neue Kolleginnen und Kollegen gewinnen schneller Orientierung.

---

## 🎯 Zielsetzung

Die Anwendung verfolgt zwei zentrale Ziele:

### 1) Strukturierteres und schnelleres Onboarding
Neue Entwickler erhalten eine direkte Übersicht über:
- relevante Teammitglieder
- Technologien und Wissensgebiete
- aktuelle Projekte im Bereich

Durch eigene Profile können sie sich gleichzeitig gegenüber dem Team vorstellen.

### 2) Verbesserung des Wissensaustauschs
Mitarbeitende sollen gezielt suchen können nach:
- Personen mit bestimmten Skills
- Ansprechpartnern zu Technologien
- Kollegen, die an bestimmten Projekten beteiligt sind

Beispiel: *„Wer kann mir bei Spring Boot helfen?“*  
Die Plattform liefert direkte Ergebnisse statt langwieriger persönlicher Nachfrage.

---

##  Umsetzung & Methodik

Die Entwicklung folgt einem **erweiterten Wasserfallmodell**, bei dem Arbeitspakete strukturiert abgearbeitet werden.  
Gleichzeitig bleiben Rücksprünge möglich, wenn Anpassungen in vorherigen Phasen erforderlich werden.

---

##  Technologiestack

### **Frontend**
- Angular
- PrimeNG
- TypeScript
- SCSS / HTML

### **Backend**
- Java
- Spring Boot
- Spring Data JPA
- Spring Security
- REST-Schnittstellen

### **Datenbank**
- PostgreSQL

### **Tools & Infrastruktur**
- Azure EntraID (Active Directory) für Authentifizierung
- Azure DevOps für Versionsverwaltung und Zusammenarbeit
- Postman für API-Tests
- Unit-Tests für Backend-Logik

---

### Verantwortungsbereich:
- Anbindung und Implementierung der **Authentifizierung** über Azure AD
- Aufbau und Umsetzung der **Benutzerprofile**
- Gestaltung der **Landingpage** und Navigation
- Entwicklung der Profilansicht inklusive **Bearbeitungsfunktion**
- Gestaltung des **Grundlayouts & Designs**
- Datenmodellierung für **Benutzer**, **Skills** und deren Relationen
- Einrichtung und Konfiguration der PostgreSQL-Datenbank
- Erstellen von **Unit-Tests** für Backend-Funktionen
- Tests und Validierung des Authentifizierungsprozesses

### Aufgaben meines Kollegen:
- Implementierung der Suchfunktion
- Aufbereitung & Visualisierung der Suchergebnisse
- Modellierung der Fähigkeiten-Kategorien und deren Darstellung

---

##  Projektkontext

Das System wird am Standort Harsewinkel der **Arvato SE** entwickelt – einem Unternehmen, das auf logistiknahe Dienstleistungen und IT-Lösungen spezialisiert ist.  
Die Entwicklung erfolgt auf firmeneigenen Arbeitsgeräten mit **IntelliJ IDEA Ultimate** und unternehmensinternen Sicherheits- und Infrastrukturvorgaben.

---

##  Projektstatus

Das Projekt befindet sich in aktiver Umsetzung. Ziel ist eine interne Anwendung, die den Wissensaustausch innerhalb der Abteilung verbessert und neue Mitarbeitende schneller in bestehende Strukturen integriert.

---

##  Kontakt

Bei Rückfragen oder Interesse am Projekt kann gerne ein Issue erstellt oder der direkte Kontakt gesucht werden.
