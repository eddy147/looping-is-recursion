(ns looping-is-recursion)

(defn recur-factorial [number]
  (let [helper (fn [acc n]
                 (if (zero? n)
                   acc
                   (recur (* acc n) (dec n))))]
    (helper 1 number)))

(defn power-helper [y, x, n]
  (cond
    (< n 0) (recur y (/ 1 x) (- n))
    (zero? n) y
    (= 1 n) (* x y)
    (even? n)
    (recur y (* x x) (/ n 2))
    :else (recur (* x y) (* x x) (/ (dec n) 2))))

(defn power [base, exp]
  (power-helper 1 base exp))

(defn last-element [a-seq]
  (cond
    (empty? a-seq) []
    (= 1 (count a-seq)) a-seq
    :else (last-element (rest a-seq))))

(defn seq= [seq1 seq2]
  ":(")

(defn find-first-index [pred a-seq]
  ":(")

(defn avg [a-seq]
  -1)

(defn parity [a-seq]
  ":(")

(defn fast-fibo [n]
  ":(")

(defn cut-at-repetition [a-seq]
  [":("])

