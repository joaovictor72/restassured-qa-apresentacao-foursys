# REQUISITOS

## Java 11, Maven configurados nas variaveis de ambiente

Acesse o site da Oracle ou do OpenJDK para baixar o JDK 11 de acordo com seu sistema operacional.
https://www.oracle.com/br/java/technologies/javase/jdk11-archive-downloads.html

 # Configure a variável de ambiente JAVA_HOME:

Abra o Painel de Controle do Windows:
 - 1: Pesquise por "Variáveis de Ambiente" e clique em "Editar as variáveis de ambiente do sistema".
 - 2: Na janela "Propriedades do Sistema", clique em "Variáveis de Ambiente".
 - 3: Em "Variáveis do sistema", clique em "Novo".
 - 4: Digite "JAVA_HOME" como nome da variável.
 - 5: No valor da variável, digite o caminho para o diretório de instalação do JDK 11. Por exemplo, "C:\Program Files\Java\jdk-11".
 - 6: Clique em "OK" para salvar a variável.
 - 7: Adicione o diretório bin do JDK ao PATH:
 - 8: Na mesma janela "Variáveis de Ambiente", localize a variável "Path" em "Variáveis do sistema" e clique em "Editar".
 - 9: Clique em "Novo" e adicione o caminho para o diretório bin do JDK 11. Por exemplo, "%JAVA_HOME%\bin".
 - 10: Clique em "OK" para salvar a variável.
 - 11: Verifique a instalação do Java: Abra um novo terminal (ou prompt de comando) e digite o comando "java -version". Deve exibir a versão do Java instalada.

----------------------------------------------------------------------------------------------------------------------------------
# Configure a variável de ambiente M2_HOME:

Acesse o site do Apache Maven para baixar a versão mais recente do Maven em formato de arquivo binário:
https://maven.apache.org/download.cgi

Abra o Painel de Controle do Windows:
 - 1: Pesquise por "Variáveis de Ambiente" e clique em "Editar as variáveis de ambiente do sistema".
 - 2: Na janela "Propriedades do Sistema", clique em "Variáveis de Ambiente".
 - 3: Em "Variáveis do sistema", clique em "Novo".
 - 4: Defina o nome da variável como "M2_HOME".
 - 5: No valor da variável, digite o caminho completo para o diretório do Maven (por exemplo, "C:\Program Files\Apache\maven").
 - 6: Clique em "OK" para salvar a variável.
 - 7: Adicione o diretório bin do Maven ao PATH:
 - 8: Na mesma janela "Variáveis de Ambiente", localize a variável "Path" em "Variáveis do sistema" e clique em "Editar".
 - 9: Clique em "Novo" e adicione "%M2_HOME%\bin" como valor.
 - 10: Clique em "OK" para salvar a variável.
 - 11: Verifique a instalação do Maven:
 - 12: Feche todos os terminais ou prompts de comando que estejam abertos.
 - 13: Abra um novo prompt de comando.
 - 14: Digite o seguinte comando: mvn -version
 - 15: Deve exibir a versão do Maven instalada e outras informações relacionadas.

----------------------------------------------------------------------------------------------------------------------------------

## ESTRUTURA DO PROJETO

# Features: 
- No Cucumber, os recursos são arquivos de especificação escritos em uma linguagem chamada Gherkin. Eles descrevem o comportamento do sistema em termos de cenários e etapas. Um recurso é composto por cenários, que representam casos de teste específicos.

# RunCucumberTest: 
A execução dos testes do Cucumber envolve a execução dos cenários descritos nos arquivos de recursos. Isso é feito por meio da definição dos passos correspondentes a cada etapa em um arquivo de passos (steps).

# Steps: 
Os steps são as implementações das etapas definidas nos cenários dos arquivos de recursos. Eles são responsáveis por interagir com o sistema em teste e realizar as ações necessárias. Os passos são escritos em uma linguagem de programação e mapeados aos cenários por meio de expressões regulares ou anotações.
