# java-ac4y-message-command - Architektúra Dokumentáció

## Áttekintés

Message command modul az Ac4y keretrendszerhez. Email-szerű üzenetküldési műveleteket biztosít.

**Verzió:** 1.0.0
**Java verzió:** 1.8
**Szervezet:** ac4y-auto

## Fő Komponensek

### 1. Ac4yCMDMessageAlgebra

**Csomag:** `ac4y.command.message.algebra`

Az `Ac4yCommand`-ot terjeszti ki request-response mintával üzenetekhez.

**Mezők:**
- `request` (Ac4yCMDMessageRequest): Üzenet kérés
- `response` (Ac4yServiceResponse): Szolgáltatás válasz

**Metódusok:**
- `getRequest()` / `setRequest()`: Request kezelés
- `getResponse()` / `setResponse()`: Response kezelés
- `createRequest()`: Új request létrehozása

### 2. Ac4yCMDMessage

**Csomag:** `ac4y.command.message.domain`

Konstruktorban automatikusan létrehozza a request-et és "MESSAGE" command nevet állít be.

### 3. Ac4yCMDMessageRequestAlgebra

**Csomag:** `ac4y.command.message.algebra`

Az `Ac4yServiceRequest`-et terjeszti ki üzenet mezőkkel.

**Mezők:**
- `sender` (String): Küldő
- `addressee` (String): Címzett
- `subject` (String): Tárgy
- `body` (String): Üzenet törzs

### 4. Ac4yCMDMessageRequest

**Csomag:** `ac4y.command.message.domain`

JAXB annotált domain osztály.

## Függőségek

```xml
<dependency>
    <groupId>ac4y</groupId>
    <artifactId>ac4y-command</artifactId>
    <version>1.0.0</version>
</dependency>
```

## AI Agent Használati Útmutató

### Gyors Döntési Fa

**Kérdés:** Üzenet küldés kell?
1. **Egyszerű üzenet** → `new Ac4yCMDMessage()` - automatikus inicializálás
2. **Testreszabott kérés** → `Ac4yCMDMessageRequestAlgebra` kiterjesztése

### Token-hatékony Tudás

**Mit tartalmaz:**
- Email-szerű üzenet struktúra (sender, addressee, subject, body)
- Automatikus request inicializálás
- JAXB szerializáció

**Függőségek:**
- ac4y-command (alap command)
- ac4y-service-domain (service request/response)

## Eredetileg

`IJAc4yCommandModule/IJAc4yMessageCommand` modulból kiemelve.

---
**Utolsó frissítés:** 2026-02-06
