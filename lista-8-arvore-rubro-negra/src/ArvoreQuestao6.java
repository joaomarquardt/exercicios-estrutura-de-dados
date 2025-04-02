class ArvoreQuestao6<Key extends Comparable<Key>, Value> {
    private abstract class No {
        abstract boolean ehTernario();
    }

    private class NoBinario extends No {
        Key chave;
        Value valor;
        No esquerdo, direito;

        NoBinario(Key chave, Value valor) {
            this.chave = chave;
            this.valor = valor;
            this.esquerdo = null;
            this.direito = null;
        }

        boolean ehTernario() {
            return false;
        }
    }

    private class NoTernario extends No {
        Key chaveEsq, chaveDir;
        Value valorEsq, valorDir;
        No esquerdo, meio, direito;

        NoTernario(Key chaveEsq, Value valorEsq, Key chaveDir, Value valorDir) {
            this.chaveEsq = chaveEsq;
            this.valorEsq = valorEsq;
            this.chaveDir = chaveDir;
            this.valorDir = valorDir;
            this.esquerdo = null;
            this.meio = null;
            this.direito = null;
        }

        @Override
        boolean ehTernario() {
            return true;
        }
    }

    private No raiz;

    public Value busca(Key chave) {
        return busca(raiz, chave);
    }

    private Value busca(No no, Key chave) {
        if (no == null) return null;

        if (!no.ehTernario()) {
            NoBinario noBin = (NoBinario) no;
            int cmp = chave.compareTo(noBin.chave);
            if (cmp == 0) {
                return noBin.valor;
            }
            else if (cmp < 0) {
                return busca(noBin.esquerdo, chave);
            }

            return busca(noBin.direito, chave);
        } else {
            NoTernario noTer = (NoTernario) no;
            int cmpEsq = chave.compareTo(noTer.chaveEsq);
            if (cmpEsq == 0) {
                return noTer.valorEsq;
            }
            else if (cmpEsq < 0) {
                return busca(noTer.esquerdo, chave);
            }

            int cmpDir = chave.compareTo(noTer.chaveDir);
            if (cmpDir == 0) {
                return noTer.valorDir;
            }
            else if (cmpDir < 0) {
                return busca(noTer.meio, chave);
            }
            return busca(noTer.direito, chave);
        }
    }

    public void adiciona(Key chave, Value valor) {
        raiz = adiciona(raiz, chave, valor);
    }

    private No adiciona(No no, Key chave, Value valor) {
        if (no == null) return new NoBinario(chave, valor);

        if (!no.ehTernario()) {
            NoBinario noBin = (NoBinario) no;
            int cmp = chave.compareTo(noBin.chave);
            if (cmp == 0) {
                noBin.valor = valor;
            } else if (cmp < 0) {
                noBin.esquerdo = adiciona(noBin.esquerdo, chave, valor);
            } else {
                noBin.direito = adiciona(noBin.direito, chave, valor);
            }
        } else {
            NoTernario noTer = (NoTernario) no;
            int cmpEsq = chave.compareTo(noTer.chaveEsq);
            int cmpDir = chave.compareTo(noTer.chaveDir);

            if (cmpEsq == 0) {
                noTer.valorEsq = valor;
            } else if (cmpEsq < 0) {
                noTer.esquerdo = adiciona(noTer.esquerdo, chave, valor);
            } else if (cmpDir == 0) {
                noTer.valorDir = valor;
            } else if (cmpDir < 0) {
                noTer.meio = adiciona(noTer.meio, chave, valor);
            } else {
                noTer.direito = adiciona(noTer.direito, chave, valor);
            }
        }

        return no;
    }
}
