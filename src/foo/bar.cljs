(ns foo.bar)

(def !a (atom 0))

(swap! !a inc)
