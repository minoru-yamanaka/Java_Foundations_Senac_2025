Guia direto e prático com os **comandos iniciais do Git** para seus alunos colocarem a mão no código e começarem a versionar seus projetos com confiança. 😄💻

---

## 🧰 Comandos Git essenciais para começar

| Comando                          | O que faz                                               |
|----------------------------------|----------------------------------------------------------|
| `git init`                       | Cria um repositório Git vazio                            |
| `git clone [URL]`                | Baixa (clona) um repositório existente da internet       |
| `git status`                     | Mostra o estado atual do repositório                     |
| `git add [arquivo]`             | Adiciona arquivos para a área de preparação (*stage*)    |
| `git add .`                      | Adiciona **todos** os arquivos modificados               |
| `git commit -m "mensagem"`      | Salva as alterações com uma descrição                    |
| `git push`                       | Envia os commits para o GitHub (repositório remoto)      |
| `git pull`                       | Baixa atualizações do repositório remoto                 |
| `git log`                        | Mostra o histórico de commits                            |

---

### 💡 Exemplo de sequência básica para começar

```bash
git init
git add .
git commit -m "primeiro commit"
git branch -M main
git remote add origin https://github.com/seuusuario/seurepositorio.git
git push -u origin main
```
