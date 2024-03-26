
(ns pretty-state.api
    (:require [pretty-state.presets :as presets]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial Demo
;
; @usage
; (re-frame.core/reg-event-fx :my-event      (fn [_ _] {:dispatch ...}))
; (re-frame.core/reg-event-fx :another-event (fn [_ _] {:dispatch ...}))
; [field {:on-blur-e  [:my-event]
;         :on-focus-e [:another-event]
;         :presets    [:pretty-state/dispatch-focus-events]}]
;
; @usage
; (re-frame.core/reg-event-fx :my-event (fn [_ _] {:dispatch ...}))
; [image {:on-error-e [:my-event]
;        :presets     [:pretty-state/dispatch-image-events]}]
;
; @usage
; (re-frame.core/reg-event-fx :my-event (fn [_ _] {:dispatch ...}))
; [field {:on-change-e [:my-event]
;         :presets     [:pretty-state/dispatch-input-field-events]}]
;
; @usage
; (re-frame.core/reg-event-fx :my-event      (fn [_ _] {:dispatch ...}))
; (re-frame.core/reg-event-fx :another-event (fn [_ _] {:dispatch ...}))
; [counter {:on-decreased-e [:my-event]
;           :on-increased-e [:another-event]
;           :presets        [:pretty-state/dispatch-input-numeric-events]}]
;
; @usage
; (re-frame.core/reg-event-fx :my-event      (fn [_ _] {:dispatch ...}))
; (re-frame.core/reg-event-fx :another-event (fn [_ _] {:dispatch ...}))
; [checkbox {:on-selected-e   [:my-event]
;            :on-unselected-e [:another-event]
;            :presets         [:pretty-state/dispatch-input-option-events]}]
;
; @usage
; (re-frame.core/reg-event-fx :my-event      (fn [_ _] {:dispatch ...}))
; (re-frame.core/reg-event-fx :another-event (fn [_ _] {:dispatch ...}))
; [field {:on-invalid-e [:my-event]
;         :on-valid-e   [:another-event]
;         :presets      [:pretty-state/dispatch-input-validation-events]}]
;
; @usage
; (re-frame.core/reg-event-fx :my-event (fn [_ _] {:dispatch ...}))
; [field {:set-value-e [:my-event]
;         :presets     [:pretty-state/dispatch-input-value-events]}]
;
; @usage
; (re-frame.core/reg-event-fx :my-event      (fn [_ _] {:dispatch ...}))
; (re-frame.core/reg-event-fx :another-event (fn [_ _] {:dispatch ...}))
; [popup {:body        "My popup"
;         :on-enter-e  [:my-event]
;         :on-escape-e [:another-event]
;         :presets     [:pretty-state/dispatch-keypress-events]}]
;
; @usage
; (re-frame.core/reg-event-fx :my-event      (fn [_ _] {:dispatch ...}))
; (re-frame.core/reg-event-fx :another-event (fn [_ _] {:dispatch ...}))
; [popup {:on-mount-e   [:my-event]
;         :on-unmount-e [:another-event]
;         :presets      [:pretty-state/dispatch-lifecycle-events]}]
;
; @usage
; (re-frame.core/reg-event-fx :my-event (fn [_ _] {:dispatch ...}))
; [button {:label      "My button"
;          :on-click-e [:my-event]
;          :presets    [:pretty-state/dispatch-mouse-events]}]
;
; @usage
; (re-frame.core/reg-event-fx :my-event (fn [_ _] {:dispatch ...}))
; [button {:label           "My button"
;          :set-reference-e [:my-event]
;          :presets         [:pretty-state/dispatch-react-events]}]
;
; @usage
; [field {:presets    [:pretty-state/subscribe-to-input-field-value]
;         :value-path [:my-value]}]
;
; @usage
; [checkbox {:options-path [:my-options]
;            :presets      [:pretty-state/subscribe-to-input-options]
;            :value-path   [:my-value]}]

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @redirect (pretty-state.presets/*)
(def dispatch-focus-events            presets/dispatch-focus-events)
(def dispatch-image-events            presets/dispatch-image-events)
(def dispatch-input-field-events      presets/dispatch-input-field-events)
(def dispatch-input-numeric-events    presets/dispatch-input-numeric-events)
(def dispatch-input-option-events     presets/dispatch-input-option-events)
(def dispatch-input-validation-events presets/dispatch-input-validation-events)
(def dispatch-input-value-events      presets/dispatch-input-value-events)
(def dispatch-keypress-events         presets/dispatch-keypress-events)
(def dispatch-lifecycle-events        presets/dispatch-lifecycle-events)
(def dispatch-mouse-events            presets/dispatch-mouse-events)
(def dispatch-react-events            presets/dispatch-react-events)
(def subscribe-to-input-field-value   presets/subscribe-to-input-field-value)
(def subscribe-to-input-options       presets/subscribe-to-input-options)
