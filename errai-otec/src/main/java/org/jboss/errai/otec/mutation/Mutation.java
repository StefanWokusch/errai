package org.jboss.errai.otec.mutation;

import org.jboss.errai.otec.Position;
import org.jboss.errai.otec.State;

/**
 * @author Christian Sadilek <csadilek@redhat.com>
 * @author Mike Brock
 */
public interface Mutation<T extends State, P extends Position, D> {
  public MutationType getType();
  public int getPosition();
  public D getData();
  public int length();
  public void apply(T state);
  public Mutation<T, P, D> newBasedOn(int index);
}