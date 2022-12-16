# Factory Pattern

This pattern is used when there is a non-trivial logic behind the creation of instances of the objects needed for the program to work or if we do not know which instances to create.

We could, for instance, have the need to create random instances or to do round robin on the types of instances we create.

Idéia para exemplo:
Um jogo onde se sorteia a distribuição de N naves no ecran inicial. N é lido do .properties.
Criar um RandomShipsFactory e um RoundRobinShipsFactory que estendem ShipFactory, que pode ser uma abstractclass.
ShipFactory contém um método chamado "createShip".

Ship é um objecto com as extensões:
MilleniumFalcom, xWingsFighter e ImperialTieFighter.
