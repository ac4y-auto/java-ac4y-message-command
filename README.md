# java-ac4y-message-command

Message command module for the Ac4y framework - email-like message operations.

## Maven Dependency

```xml
<dependency>
    <groupId>ac4y</groupId>
    <artifactId>ac4y-message-command</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Overview

Provides message-based command operations with sender, addressee, subject, and body fields. Suitable for inter-system or inter-component message communication.

## Dependencies

- `ac4y:ac4y-command:1.0.0` (base command)
- `ac4y:ac4y-service-domain:1.0.0` (service request/response)

## Package Structure

- `ac4y.command.message.algebra` - Message algebra and request algebra
- `ac4y.command.message.domain` - Message command and request domain classes

## Usage

```java
Ac4yCMDMessage message = new Ac4yCMDMessage();
message.getRequest().setSender("alice@company.com");
message.getRequest().setAddressee("bob@company.com");
message.getRequest().setSubject("Project Update");
message.getRequest().setBody("The project is on track.");
```

## Build

```bash
mvn clean install
mvn test
```

## Origin

Extracted from `IJAc4yCommandModule/IJAc4yMessageCommand` module.

---
**Version:** 1.0.0
