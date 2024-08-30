import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class UsuarioServiceTest {
    @Mock
    private UsuarioRepo usuarioRepo;

    @InjectMocks
    private UsuarioService usuarioService;

    @BeforeEach
    void setUp() {
        // Inicializa los mocks de Mockito
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void crearUsuario() {
        UsuarioDto usuarioDto = new UsuarioDto(1, "Carlos");
        Mockito.when(usuarioRepo.crearUsuario("Carlos")).thenReturn(usuarioDto);
        UsuarioDto resultado = usuarioRepo.crearUsuario("Carlos");
        assertEquals(resultado.name, usuarioDto.name);
    }

    @Test
    void obtenerUser() {
        UsuarioDto usuarioDto = new UsuarioDto(1, "Carlos");
        Mockito.when(usuarioRepo.obtenerUsuario(1)).thenReturn(usuarioDto);
        assertEquals(usuarioService.obtenerUser(1), usuarioDto);
    }
}