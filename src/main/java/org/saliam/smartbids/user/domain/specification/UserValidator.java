package org.saliam.smartbids.user.domain.specification;

import org.saliam.smartbids.commons.validation.Specification;
import org.saliam.smartbids.commons.validation.Validator;
import org.saliam.smartbids.user.domain.entity.User;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserValidator implements Validator<User>
{
  private static final List<Specification<User>> rules = getRules();

  private static List<Specification<User>> getRules()
  {
    List<Specification<User>> rules = new ArrayList<>();
    rules.add(new IdNotEmptySpecification());
    rules.add(new NameWithinMaxLengthSpecification());
    return rules;
  }

  @Override public boolean isValid(User entity)
  {
    return brokenRules(entity).hasNext();
  }

  @Override public Iterator<Specification<User>> brokenRules(User entity)
  {
    return rules.stream().filter(rule -> !rule.IsSatisfiedBy(entity)).iterator();
  }
}
