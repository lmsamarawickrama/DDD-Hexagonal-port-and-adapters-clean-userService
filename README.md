# DDD-Hexagonal-port-and-adapters-clean-userService (Keep options open)

This poc demonstrates how to use clean architecture along with onion/port and adapters/hexagonal architectural patterns for a single domain called user.
And also this demonstrates how architecture is screaming (screaming architecture)

1. Domain layer consists with user aggragte (user entity and role entity), use cases (domain services for user's operations), repository (repository pattern)
2. Infrastructure layer includes databases (currrently mysql is plugged in)
3. Application layer handles all the transactions
4. Presentation layer for current implementation is Rest (but can easily plug graph ql, Grpc, web socket and etc.)

Noe : Same functionality (same user service) implemented using legacy layered architecture lives in https://github.com/lmsamarawickrama/User-serivce-legacy-layered-architecture

