Projeto Feito em arquitetura MVC (Model, View e Cotroller) 

Model (Modelo):
Responsável pelos dados e lógica de negócio da aplicação. Ele representa os objetos e acessa o banco de dados, regras de validação etc.

View (Visão):
Responsável pela interface com o usuário. É o que o usuário vê e interage — como páginas HTML, telas ou qualquer saída visual.

Controller (Controlador):
Atua como intermediário entre a View e o Model. Recebe entradas do usuário (por exemplo, cliques ou formulários), processa essas ações (talvez atualize o Model) e decide qual View será exibida em seguida.

Fluxo geral:
Usuário interage com a View → a View envia o comando para o Controller → o Controller atualiza o Model → o Model atualiza os dados → a View é atualizada com os novos dados

OBS: Nesse projeto, ainda não estamos trabalhando com interfaces visuais, como o JFrame Java Swing, portanto, essa parte sera representada pelos menus exibidos em terminais

Biblioteca Faker:

A biblioteca Faker no Java serve para gerar dados falsos realistas (como nomes, endereços, datas, CPFs, empresas etc.) de forma fácil e automatizada — ideal para testes e preenchimento de objetos mockados. Ela simula dados como se fossem reais, mas sem depender de informações verdadeiras.

Nesse projeto, além das Pacotes tradicionais de Model, View e Controller, Tambem temos um pacote Faker, que é responsável pela geração de objetos Falsos para suas Respectivas classes, facilitando a rotação de testes.

O auxilio de inteligencias artificiais foi usado para automatização de alguns precessos, como por exemplo a geração de controllers, uma vez que reescrever diversas vezes o mesmo codígo porém para objetos diferentes é uma prática pouco eficiente hoje em dia. No entanto, particularmente estivamos optando
por utilizar metodos estáticos, dispensando a instancia de objetos para todos os metodos, e u uso de inteligencia artificial sem a revisão adequada afetou a consistencia dessa desisão, fazendo com que haja a presença (mesmo que pouca) de metodos nãos estaticos que necessitam de instancia.
