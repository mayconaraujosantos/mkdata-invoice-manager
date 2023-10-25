### MVP - invoices-manager

#### Configuração de tarefas agendadas
- [ ] **US1.1**: Como sistema, quero executar tarefas em intervalos específicos para verificar se é necessário realizar raspagens de dados.

#### Gestão de Credenciais
- [ ] **US2.1**: Como administrador, quero armazenar credenciais de acesso ao site, como usuário e senha, de forma segura.
- [ ] **US2.2**: Como sistema, quero recuperar a senha de um site e descriptografá-la para poder usar na autenticação durante a raspagem.

#### Verificação de Data de Vencimento
- [ ] **US3.1**: Como sistema, quero verificar diariamente se a data atual corresponde a uma das datas de vencimento dos sites cadastrados.

#### Execução da Raspagem e Salvamento
- [ ] **US4.1**: Como sistema, se a data atual for uma data de vencimento, quero acionar o processo de raspagem.
- [ ] **US4.2**: Como sistema, após a raspagem, quero salvar os dados coletados no banco de dados.

#### Detalhamento das User Stories:

**US1.1 - Executar tarefas em intervalos específicos**
- [ ] O sistema deve verificar diariamente, em um horário definido, se existem tarefas de raspagem para serem realizadas.

**US2.1 - Armazenar credenciais de acesso de forma segura**
- [ ] Ao receber uma senha, o sistema deve criptografar essa senha antes de armazená-la.
- [ ] A senha original nunca deve ser armazenada diretamente.

**US2.2 - Recuperar e descriptografar a senha**
- [ ] O sistema deve ser capaz de descriptografar uma senha armazenada para usá-la na autenticação.

**US3.1 - Verificar data de vencimento**
- [ ] O sistema deve comparar a data atual com as datas de vencimento armazenadas.
- [ ] Se a data atual corresponder a uma data de vencimento, o sistema deve acionar o processo de raspagem para esse site específico.

**US4.1 - Acionar o processo de raspagem**
- [ ] O sistema deve autenticar-se no site usando as credenciais armazenadas.
- [ ] O sistema deve raspar os dados relevantes do site.

**US4.2 - Salvar dados coletados**
- [ ] O sistema deve armazenar os dados coletados em uma estrutura pré-definida no banco de dados.
- [ ] Em caso de falha na raspagem, o sistema deve registrar o erro para análise posterior.
