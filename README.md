# Conjure Repro Case

Reproduces the problem with conjure and CLJS with piggieback.

## Steps

In one terminal, run:

```bash
clj -M -m nrepl.cmdline --middleware '[cider.piggieback/wrap-cljs-repl]'
```

In the other, run:

```clojure
clj -M -m cljs.main -w src -c foo.bar
```

In neovim, connect to the Clojure REPL.

Then use the command `:ConjurePiggieback (cljs.repl.browser/repl-env)` to connect to the CLJS repl.

Now, evaluate the `foo.bar` namespace. It contains an atom which will increment every time the namespace is evaluated.
