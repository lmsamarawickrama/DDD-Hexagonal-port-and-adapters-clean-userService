package org.saliam.smartbids.user.infrastructure.config;

import org.mapstruct.factory.Mappers;
import org.saliam.smartbids.user.domain.port.in.UserService;
import org.saliam.smartbids.user.domain.port.out.UserRepository;
import org.saliam.smartbids.user.domain.service.UserServiceImpl;
import org.saliam.smartbids.user.domain.specification.UserValidator;
import org.saliam.smartbids.user.infrastructure.adapter.database.mapper.UserEntityMapper;
import org.saliam.smartbids.user.infrastructure.adapter.database.repository.RoleEntityRepository;
import org.saliam.smartbids.user.infrastructure.adapter.database.repository.UserEntityRepository;
import org.saliam.smartbids.user.infrastructure.adapter.database.repository.UserRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration
{
  @Bean(name = "org.saliam.smartbids.user.domain.port.out.UserRepository")
  public UserRepository getUserRepository(final UserEntityRepository userEntityRepository, final RoleEntityRepository roleEntityRepository)
  {
    return new UserRepositoryAdapter(userEntityRepository, Mappers.getMapper(UserEntityMapper.class),
        roleEntityRepository);
  }

  @Bean(name = "org.saliam.smartbids.user.domain.port.in.UserService")
  public UserService getUserService(final UserRepository userRepository)
  {
    return new UserServiceImpl(userRepository, new UserValidator());
  }
}
