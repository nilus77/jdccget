package jdcc.dispatcher;

import jdcc.events.Event;

public interface DispatcherObserver {
    /***
     * Con questo metodo il dispatcher notifica l'observer
     * dell'arrivo di un nuovo evento.
     *
     * @param Event l'evento per cui viene notificato l'observer.
     */
    void notify(Event Event);
}
