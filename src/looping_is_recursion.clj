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
    (empty? a-seq) nil
    (= 1 (count a-seq)) (first a-seq)
    :else (recur (rest a-seq))))

(defn seq= [a-seq b-seq]
  (cond
    (and (empty? a-seq) (empty? b-seq)) true
    (or (empty? a-seq) (empty? b-seq)) false
    (not= (first a-seq) (first b-seq)) false
    :else (recur (rest a-seq) (rest b-seq))))

(defn find-first-index [pred a-seq]
  (loop [s a-seq
         k 0]
    (if (empty? s) nil
        (if (pred (first s))
          k
          (recur (rest s) (inc k))))))

(defn avg [a-seq]
  -1)

(defn parity [a-seq]
  ":(")

(defn fast-fibo [n]
  ":(")

(defn cut-at-repetition [a-seq]
  [":("])

