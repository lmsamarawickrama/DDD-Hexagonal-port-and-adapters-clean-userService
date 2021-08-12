# DDD-Hexagonal-port-and-adapters-clean-userService

This poc demonstrates how to use clean architecture along with onion/port and adapters/hexagonal architectural patterns for a single domain called user

Domain layer consists with user aggragte (user entity and role entity), use cases (domain services for user's operations), repository (repository pattern)
Infrastructure layer includes databases (currrently mysql is plugged in)
Application layer handles all the transactions
Presentation layer for current implementation is Rest (but can easily plug graph ql, Grpc, web socket and etc.)

